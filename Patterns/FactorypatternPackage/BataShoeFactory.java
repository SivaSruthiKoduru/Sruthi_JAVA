package FactoryPatternPackage;

class BataShoeFactory extends ShoeFactory
{
	public BataShoeFactory() {
		// TODO Auto-generated constructor stub
	}
	public Shoe makeShoe()
	{
		return new LeatherShoe();
	}
}