package se.coredev.secure.ex6;

import java.security.Permission;

public final class OurSecurityManager extends SecurityManager
{

	@Override
	public void checkPermission(Permission perm)
	{
		if (perm.getName().equals("suppressAccessChecks"))
		{
			throw new SecurityException("Evil user!");
		}
		else
		{
			super.checkPermission(perm);
		}

	}

}
