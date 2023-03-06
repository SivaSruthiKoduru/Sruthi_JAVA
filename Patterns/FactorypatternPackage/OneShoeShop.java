package FactoryPatternPackage;

class OneShoeShop extends ShoeShop
{
	public OneShoeShop() {
		// TODO Auto-generated constructor stub
	}
	public Shoe sellShoe(Customer customer)
	{
		return getFactory().makeShoe();
	}
}