package CustomeTShirts.classes;

import CustomeTShirts.classes.Tshirt.Size;

public class Runner 
{
	public static Design[] designs = new Design[3];

	public static void main(String[] args) 
	{		
		designs  = createColorsOfDesigns();
		Tshirt[] shirts = new Tshirt[3];
		shirts[0] = new Tshirt(Size.M, designs[0], 0.9d, 10d);
		shirts[1] = new Tshirt(Size.S, designs[1], 0.9d, 35d);
		shirts[2] = new Tshirt(Size.XL,designs[2], 0.5d, 12.5d);

		for (Tshirt tShirt : shirts) 
		{
			System.out.println(tShirt);
			System.out.println("The final price is:"+tShirt.calculateFinalPrice()+" its expensive? "+tShirt.isExpensive());
			System.out.println();
		}
	}
	
	public static Design[] createColorsOfDesigns()
	{
		Color[] colors = new Color[3];
		colors[0] = new Color((short)50, (short)50, (short)50);
		colors[1] = new Color((short)100, (short)100, (short)0);
		colors[2] = new Color((short)0, (short)0, (short)200);	
		
	//	Design[] designs = new Design[3];
		designs = createDesignsOfTshirts(colors);
		return designs;
	}
	
	public static Design[] createDesignsOfTshirts(Color[] colors)
	{
	//	Design[] designs = new Design[3];
		designs[0] = new Design(0, 0, "Game Of Thrones", colors[0], 50);
		designs[1] = new Design(30d, 10d, "Vikings", colors[1], 50);
		designs[2] = new Design(22.5d, 19.9d, "Breaking Bad", colors[2], 11);
		return designs;
	}
}
