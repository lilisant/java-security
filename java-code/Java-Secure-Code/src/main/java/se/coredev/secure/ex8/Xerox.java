package se.coredev.secure.ex8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class Xerox
{

	public static Object deepCopy(final Object source)
	{
		try
		{
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			new ObjectOutputStream(bos).writeObject(source);
			ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
			return new ObjectInputStream(bin).readObject();
		}
		catch (Exception e)
		{
			throw new RuntimeException("Ooops!", e);
		}
	}	
}
