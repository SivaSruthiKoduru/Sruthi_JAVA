package day1;
import java.util.Scanner;

public class resizeAnArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int array1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array1[i]=sc.nextInt();
		}
		int resize;
		System.out.println("enter resize");
		resize=sc.nextInt();
		int size;
		int array2[]=new int[resize];
		if(n>resize) {
			size=resize;
		}
		else
		{
			size=n;
		}
		for(int k=0;k<size;k++)
		{
			array2[k]=array1[k];
		}
		for(int j=0;j<resize;j++)
		{
			System.out.println(array2[j]);
		}
		
		sc.close();
		
		
	}
	
	
			
	

}
