package FactoryPatternPackage;

abstract class ShoeShop implements ShoeSeller
{
	private ShoeFactory shoefactory;
	public abstract Shoe sellShoe(Customer customer);
	public void setFactory(ShoeFactory shoefactory)
	{
		this.shoefactory=shoefactory;
	}
	public ShoeFactory getFactory()
	{
		return this.shoefactory;
	}
}