package FactoryPattern2Re;

public class ShoeFactory {
	public Shoe getInstance(String str)
	{
		if(str.equals("bata"))
		{
			return new BataShoe();
		}
		else if(str.equals("adidas"))
		{
			return new AdidasShoe();
		}
		else if(str.equals("nike"))
		{
			return new NikeShoe();
		}
		else
		{
			return null;
		}
		
	}

}
