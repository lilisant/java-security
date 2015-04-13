package se.coredev.secure.ex8;

public class Main
{
	public static void main(String[] args)
	{
		LonelyException lonelyException = LonelyException.INSTANCE;
		LonelyException clone = (LonelyException) Xerox.deepCopy(LonelyException.INSTANCE);

		System.out.println(lonelyException == clone);
		
	}
}
