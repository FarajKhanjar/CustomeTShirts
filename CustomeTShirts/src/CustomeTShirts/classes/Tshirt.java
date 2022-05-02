package CustomeTShirts.classes;

public class Tshirt 
{
   
	protected Size size;
    protected Design design;
    protected double demandFactor = 0.1;
    protected double basePrice = 3; // 3 min
    int randomMax = (int) (Math.random() * (1000));
    protected double finalprice;

    public Tshirt(Size size, Design design, double demandFactor, double basePrice) 
    {
		this.size = size;
		this.design = design;
		this.demandFactor = ((Math.random() * (0.9)) + 0.1);
		this.basePrice = ((Math.random() * (randomMax - 3)) + 3);
	}

   
    public void calculateFinalPrice()
    {
    	finalprice = (basePrice + design.complexity)* (design.calculateArea()/demandFactor);
    }
    
    public boolean isExpensive()
    {
    	if(this.finalprice > 10000)
    		return true;
    	else
    		return false;
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
