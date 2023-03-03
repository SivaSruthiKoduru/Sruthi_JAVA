package day2;

public class day2Pr6 {
	public static void main(String[] args) {
		System.out.println("Inside main method");
		A a =new A();
		
		
	}
	static
	{
		System.out.println("Inside Static block 1");
	}
	static
	{
		System.out.println("Inside static block 2");
	}
	static
	{
		System.out.println("Inside static block 3");
	}

}
class A
{
	static {
		System.out.println("Inside static block of class A");
	}
	A()
	{
		System.out.println("Inside constructor A");
	}
}
