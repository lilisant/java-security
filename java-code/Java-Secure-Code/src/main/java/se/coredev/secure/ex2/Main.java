package se.coredev.secure.ex2;

import java.util.HashSet;
import java.util.Set;


public class Main
{
	public static void main(String[] args)
	{
		Set<User> users = new HashSet<>();
		users.add(new User("master"));
		users.add(new User("master"));
		
		System.out.println("Count:" + users.size());
	}
}
