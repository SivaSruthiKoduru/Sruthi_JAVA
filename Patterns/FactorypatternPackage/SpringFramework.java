package FactoryPatternPackage;

class SpringFramework{
	public static ShoeShop getShop()throws Exception {
	
		
		ShoeFactory factory=(ShoeFactory)Class.forName("FactoryPatternPackage.BataShoeFactory").getConstructor().newInstance();
		ShoeShop shop=(ShoeShop)Class.forName("FactoryPatternPackage.OneShoeShop").getConstructor().newInstance();
		
		shop.setFactory(factory);
		
		
		return shop;
	}
}
