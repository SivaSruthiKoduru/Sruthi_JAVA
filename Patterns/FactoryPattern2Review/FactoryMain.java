package FactoryPattern2Re;
import java.util.Scanner;
public class FactoryMain {
	public static void main(String[] args) {
		ShoeFactory shoeFactory = new ShoeFactory();
		System.out.println("Enter the company name..");
		Scanner scan = new Scanner(System.in);
		String company=scan.next();
		Shoe shoe=shoeFactory.getInstance(company);
		shoe.deliverShoe();
	}

}
