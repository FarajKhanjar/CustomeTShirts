package CustomeTShirts.classes;

public class Color 
{
	// Fields
	protected static short R ;
	protected static short G ;
	protected static short B ;

	// Constructor
	public Color() 
	{
		this.R = (short) (Math.random() * 256);
		this.G = (short) (Math.random() * 256);
		this.B = (short) (Math.random() * 256);
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
