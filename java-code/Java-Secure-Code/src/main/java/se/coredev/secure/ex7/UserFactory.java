package se.coredev.secure.ex7;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public final class UserFactory
{
	public static final User NULL_USER = new UserImpl();
	
	public static User createUserFromString(String userAsString)
	{
		String[] values = userAsString.split(";");
		if(values.length < 3)
		{
			return NULL_USER;
		}
		return new UserImpl(values[0], values[1], values[2]);
	}
	
	private static final class UserImpl implements User
	{
		private final String userName;
		private final String firstName;
		private final String lastName;

		private UserImpl()
		{
			this("", "", "");
		}
		
		public UserImpl(String userName, String firstName, String lastName)
		{
			this.userName = userName;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String getUserName()
		{
			return userName;
		}

		public String getFirstName()
		{
			return firstName;
		}

		public String getLastName()
		{
			return lastName;
		}
		
		@Override
		public String toString()
		{
			return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
		}
	}
}
