package se.coredev.secure.ex6;

public final class Unsafe
{
	static
	{
		if (!(System.getSecurityManager() instanceof OurSecurityManager))
		{
			throw new SecurityException("Wrong security manager");
		}
	}

	private final String masterPassword = "ultr4zicrii3t";

	public String getSecretMessage(String password)
	{
		if (masterPassword.equals(password))
		{
			return "Hello master!";
		}
		else
		{
			return "Unauthorized!";
		}
	}
}