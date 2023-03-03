package day1;
import java.util.Scanner;

public class pr16PresentAbsent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[]= {2,4,5,6,7,8,8,2};
		int len=array.length;
		int count=0;
		System.out.println("Enter search element");
		int x=sc.nextInt();
		for(int i=0;i<len;i++)
		{
			if(array[i]==x) {
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("Found");
			System.out.println(count+"");
		}
		System.out.print("At  ");
		for(int i=0;i<len;i++)
		{
			if(x==array[i])
			{
				System.out.print(i);
			}
		}
		
	}

}
