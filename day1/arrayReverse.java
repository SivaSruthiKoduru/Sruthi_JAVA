package day1;
import java.util.Scanner;

public class arrayReverse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size;
		System.out.println("Enter size");
		size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		int revArr[]=new int[size];
		int k=0;
		for(int i=size-1;i>=0;i--)
		{
			revArr[k]=array[i];
			k++;
		}
		System.out.println("Reversed Array");
		for(int i=0;i<size;i++)
		{
			System.out.println(revArr[i]);
		}
		sc.close();
	}

}
