package se.coredev.secure.ex6;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		System.setSecurityManager(new OurSecurityManager());
		
		Unsafe unsafe = new Unsafe();
		List<Object> passwords = getSecretPassword(unsafe);
		
		for(Object o : passwords)
		{
			if(o instanceof String)
			{
				System.out.println(unsafe.getSecretMessage((String) o));
			}
		}		
	}

	private static List<Object> getSecretPassword(Unsafe unsafe) throws Exception
	{
		final List<Object> result = new ArrayList<>();
		
		Class<? extends Unsafe> clazz = unsafe.getClass();
		Field[] fields = clazz.getDeclaredFields();

		for (int i = 0; i < fields.length; i++)
		{
			fields[i].setAccessible(true);
			result.add(fields[i].get(unsafe));
		}

		return result;
	}
}
