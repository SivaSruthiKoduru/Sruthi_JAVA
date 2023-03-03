package day1;
import java.util.Scanner;

public class AverageOfN {
	public static void main(String[] args) {
		AverageOfN avg= new AverageOfN();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int array[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		avg.average(array,n);
		sc.close();
		
	}
	void average(int arr[],int n)
	{
		float sum=0.0f;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		float avg;
		avg=sum/n;
		System.out.println("Average is "+avg);
	}

}
