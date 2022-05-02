package CustomeTShirts.classes;

public class Tshirt 
{
   
	protected Size size;
	protected Design design;
    protected double demandFactor = 0.1;
    protected double basePrice; // 3 min
    int randomMax = (int) (Math.random() * (500));
    protected double finalprice;

    public Tshirt(Size size, String slogn, Color color) 
    {
		this.size = size;
		this.design = new Design(slogn,color);
		this.demandFactor = ((Math.random() * (0.9)) + 0.1);
		this.basePrice = ((Math.random() * (randomMax - 3)) + 3);
		this.finalprice = calculateFinalPrice();
	}

   
    public double calculateFinalPrice()
    {
    	finalprice = (basePrice + design.complexity)*(design.calculateArea()/demandFactor);
    	return finalprice;
    }
    
    public boolean isExpensive()
    {
    	if(this.finalprice > 10000)
    		return true;
    	else
    		return false;
    }
    
    public String priceStatus()
    {
    	if(isExpensive())
    		return "Its Expensive Tshirt!";
    	else
    		return "The price of the Tshirt is ok!";
    }
    
  //  @Override
	public void printDetails() 
	{
		System.out.println("\nTshirt [size=" + size + ", design slogn =" + design.slogan + ", demandFactor=" + demandFactor
				+ "\n, basePrice=" + basePrice + ", finalprice= " + finalprice 
				+ "\n " + priceStatus()+ "]"); 
	}
    
    public enum Size
	{
		XS,
		S,
		M,
		L,
		XL;
	}

}
