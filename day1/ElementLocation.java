package day1;
import java.util.Scanner;

public class ElementLocation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int found=0;
		System.out.println("Enter size");
		size=sc.nextInt();
		int array[]=new int [size];
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("enter search element");
		int x=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(array[i]==x)
			{
				System.out.println("Element at index "+i);
				found=1;
			}
		}
		if(found==0) {
			System.out.println("Not found");
		}
		sc.close();
		
		
	}

}
