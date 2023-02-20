package day2;
import java.util.Scanner;

public class day2Pr15 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter door width");
		int a=sc.nextInt();
		System.out.println("Enter door height");
		int b=sc.nextInt();
		System.out.println("Enter window width");
		int c=sc.nextInt();
		System.out.println("Enter window height");
		int d=sc.nextInt();
		House h = new House(a,b,c,d);
		
		
	}
	

}
class House
{
	int doorWidth;
	int doorHeight;
	int windowWidth;
	int windowHeight;
	Door d=new Door();
	Window w=new Window();
	House(int a,int b,int c,int d)
	{
	
		 doorWidth=a;
		 doorHeight=b;
		 windowWidth=c;
		windowHeight=d;
		cost();
	}
	
	void cost()
	{
		d.calculateCostOfDoor(doorWidth,doorHeight);
		w.calculateCost(windowWidth, windowHeight);
	}
}
class Door
{
	void calculateCostOfDoor(int a,int b)
	{
		int area=a*b;
		int costPerUnitArea=50;
		System.out.println("Total cost: " +area*costPerUnitArea);
	}
}
class Window
{
	void calculateCost(int a,int b)
	{
		int area=a*b;
		int costPerUnitArea=45;
		System.out.println("Total cost: " +area*costPerUnitArea);
	}
	
}