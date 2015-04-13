package se.coredev.secure.ex1;

public class Point
{
	private final int x;
	private final int y;
	private String name;

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;		
	}

	protected String getName()
	{
		return "[x:" + x + "," + y + "]";
	}

	@Override
	public final synchronized String toString()
	{
		if(name == null){
			name = getName();
		}
		return name;
	}
}