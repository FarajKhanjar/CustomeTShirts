package CustomeTShirts.classes;

public class Color 
{
	// Fields
	protected static short R = (short) (Math.random() * 256);
	protected static short G = (short) (Math.random() * 256);
	protected static short B = (short) (Math.random() * 256);

	// Constructor
	public Color(short R, short G, short B) 
	{
		this.R = R;
		this.G = G;
		this.B = B;
	}

	private String getDominant() 
	{
		short highestValue = R;
		String nameOfColor = "Red";
		if (G > highestValue) {
			highestValue = G;
			nameOfColor = "Green";
		}
		if (B > highestValue) {
			highestValue = B;
			nameOfColor = "Blue";
		}

		return nameOfColor;
	}

	private void normalized() 
	{

	}

}
