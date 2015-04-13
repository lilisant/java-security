package se.coredev.secure.ex7;

public class Main
{
	public static void main(String[] args)
	{
		String userAsString = "anca01:Anders;Carlsson";
		User user = UserFactory.createUserFromString(userAsString);
		
		System.out.println(user);
		
	}	
}
