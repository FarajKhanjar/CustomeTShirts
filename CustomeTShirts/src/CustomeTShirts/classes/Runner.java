package CustomeTShirts.classes;

import CustomeTShirts.classes.Tshirt.Size;

public class Runner 
{

	public static void main(String[] args) 
	{
		Color color_1 = new Color();
		Tshirt tShirt_1 = new Tshirt(Size.M,"Game Of Thrones",color_1); 
		
		Color color_2 = new Color();
		Tshirt tShirt_2 = new Tshirt(Size.S,"Vikings",color_2); 
		
		Color color_3 = new Color();
		Tshirt tShirt_3 = new Tshirt(Size.L,"Breaking Bad",color_3); 

	}

}
