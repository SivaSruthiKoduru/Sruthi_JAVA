package day1;
import java.util.Scanner;

public class pr15bNumberType {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		num=sc.nextInt();
		isArm(num);
		isPerfect(num);
		isPalin(num);
		
	}
	public static void isArm(int n)
	{
		int temp=n;
		int result=0;
		while(temp!=0)
		{
			int rem=temp%10;
			result+=Math.pow(rem,3);
			temp=temp/10;
		}
		if(result==n)
		{
			System.out.println("armstrong");
		}
	}
	public static void isPerfect(int n)
	{
		int temp=n;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("perfect");
		}
	}
	public static void isPalin(int n)
	{
		int temp=n;
		int rev=0;
		while(temp!=0)
		{
			int rem=temp%10;
			rev=rev*10+rem; 
			temp/=10;
			
		}
		if(rev==n)
		{
			System.out.println("Pailndrome");
		}
	}

	
}
