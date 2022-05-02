package CustomeTShirts.classes;

public class Design 
{
	
	// Fields 
	protected double width = ((Math.random() * (10)) + 10);
	protected double height = ((Math.random() * (15)) + 10);
	protected String slogan;  // {words have only digits and letters}
	protected Color color ;  
	protected double complexity = ((Math.random() * (99)) + 1); 

	public Design(double width, double height, String slogan, Color color, double complexity) 
	{
		this.width = width;
		this.height = height;
		setSlogan(slogan);
		this.color = color;
		this.complexity = complexity;
	}

	
	private double calculateArea()
	{
		double area = this.width*this.height;
		return area;
	}
	
	
	private void setSlogan(String slgn)
	{	       
	       this.slogan = slgn;
	}

}
