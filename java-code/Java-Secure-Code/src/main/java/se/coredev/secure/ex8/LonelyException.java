package se.coredev.secure.ex8;

public final class LonelyException extends Exception
{
	public transient static final LonelyException INSTANCE = new LonelyException("There can be only one!");
	
	private LonelyException(String message)
	{
		super(message);
	}
	
	private Object readResolve()
	{
		return INSTANCE;
	}
}
