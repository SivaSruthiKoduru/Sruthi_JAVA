package FactoryPatternPackage;
public class FactoryPattern {
public static void main(String[] args)throws Exception {
		
		ShoeShop shop=SpringFramework.getShop();
		System.out.println(shop.sellShoe(new Customer()));
		
		
	}

}













