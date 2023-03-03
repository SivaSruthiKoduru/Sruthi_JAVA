package VisitorPatternPackage;
import java.util.Scanner;

public class VisitorPattern {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the item name");
		String item=scan.next();
		Child child = new Child();
		Dog dog = new Dog();
		child.playWithDog(dog,item);
	}

}






