package FactoryPatternPackage;


class TwoShoeShop extends ShoeShop
{
	public TwoShoeShop() {
		// TODO Auto-generated constructor stub
	}

	public Shoe sellShoe(Customer customer)
	{
		return getFactory().makeShoe();
	}
}