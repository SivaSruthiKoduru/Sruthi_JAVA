package day2;
import java.text.*;

public class day2Pr1 {
	static int i=200;
	public static void change(int[] array)
	{
		array[0]=10;
	}
	public static void changePrim(int a)
	{
		a=90;
	}
	public void changeObj(day2Pr1 d,int i)
	{
		d.i=700;
	}
	
	public static void main(String[] args) {
	
		int array[]=new int[10];
		array[0]=90;
		System.out.println("Value before: "+array[0]);
		change(array);
		System.out.println("Value after: "+array[0]);
		int b=100;
		System.out.println("Value before: "+b);
		changePrim(b);
		System.out.println("Value after: "+b);
		day2Pr1 d = new day2Pr1();
		System.out.println("Value before: "+i);
		d.changeObj(d,i);
		System.out.println("Value after: "+i);
		
		
			
	}

}
