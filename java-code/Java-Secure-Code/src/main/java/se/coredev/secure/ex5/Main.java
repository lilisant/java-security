package se.coredev.secure.ex5;

import java.util.HashSet;
import java.util.Set;

public class Main
{

	public static void main(String args[]) throws Exception
	{
		User user = new User("master", "2015-04-13");
		User clone = new User("master", "2015-04-12");

		Set<User> users = new HashSet<>();
		users.add(user);
		users.add(clone);
		clone.getRegistrationDate().setTime(user.getRegistrationDate().getTime());

		for (User u : users)
		{
			System.out.println(u);
		}
	}
}
