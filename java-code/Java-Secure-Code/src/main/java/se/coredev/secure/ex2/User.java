package se.coredev.secure.ex2;

public final class User
{
	private final String username;

	public User(String username)
	{
		this.username = username;
	}

	public String getUsername()
	{
		return username;
	}

	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof User)) { return false; }
			
		User u = (User) o;
		return username.equals(u.username);
	}
	
	@Override
	public int hashCode()
	{
		return 37 * username.hashCode();
	}
	
	@Override
	public String toString()
	{
		return username;
	}
}