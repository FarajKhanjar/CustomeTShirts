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

	/**
	 * In this method
	 * @return the name of the field with the highest value.
	 */
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

	
	/**
	 * In this method
	 * @return the normalized values (range [0,1]) of the colors in an RGB array.
	 */
	private float normalized() 
	{
		return 0f;
	}

}
