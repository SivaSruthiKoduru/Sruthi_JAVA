package day1;
import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,count=0;
		System.out.println("enter num");
		i=sc.nextInt();
		for(int k=1;k<i;k++)
		{
			if(i%k==0)
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("prime");
		}
		sc.close();
	}

}
