package CustomeTShirts.classes;

public class Utils 
{
	public static boolean isInRange(int value, int min, int max) 
	{
		return value >= min && value <= max;
	}

	public static boolean isInRange(double value, double min, double max) 
	{
		return value >= min && value <= max;
	}
	
	public static boolean isInRange(short value, short  min, short  max) 
	{
		return value >= min && value <= max;
	}
	
	public static boolean isLetterDigits(String str) 
	{
		if(str == null)
		{
			return false;
		}
		str = str.replaceAll("\\s", ""); //"\\s" = space.
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!(Character.isLetter(ch) || Character.isDigit(ch))) 
			{
				return false;
			}
		}
		return true;
	}

}
