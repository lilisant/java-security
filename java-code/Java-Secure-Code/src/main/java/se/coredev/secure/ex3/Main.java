package se.coredev.secure.ex3;

import java.util.HashSet;
import java.util.Set;

public class Main
{
	public static void main(String[] args)
	{
		Set<User> users = new HashSet<>();
		
		User anca01 = new User("anca01");
		
		users.add(anca01);
		anca01.setUsername("----");
		
		users.add(new User("anca01"));
		
		anca01.setUsername("anca01");
		
		System.out.println("Number of users:" + users.size());
	}
}
