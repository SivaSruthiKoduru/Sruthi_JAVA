package FactoryPatternPackage;

class StepsShoeFactory extends ShoeFactory
{
	public StepsShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	public Shoe makeShoe()
	{
		return new SportsShoe();
	}
}