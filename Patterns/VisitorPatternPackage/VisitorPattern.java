package VisitorPatternPackage;
import java.util.Scanner;

public class VisitorPattern {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item name");
		String item=sc.next();
		Child c = new Child();
		Dog dog = new Dog();
		c.playWithDog(dog,item);
	}

}






