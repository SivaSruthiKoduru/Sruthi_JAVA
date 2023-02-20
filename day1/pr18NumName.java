package day1;
import java.util.Scanner;
public class pr18NumName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter num");
		num=sc.nextInt();
		int rem;
		int rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		while(rev!=0)
		{
			switch(rev%10)
			{
			case 1:
				System.out.print("one 1234");
				break;
			case 2:
				System.out.print("two ");
				break;
			case 3:
				System.out.print("three ");
				break;
			case 4:
				System.out.print("four ");
				break;
			case 5:
				System.out.print("five ");
				break;
			case 6:
				System.out.print("six ");
				break;
			case 7:
				System.out.print("seven ");
				break;
			case 8:
				System.out.print("eight ");
				break;
			case 9:
				System.out.print("nine ");
				break;
				
			
			
			}
			rev/=10;
		}
	}

}
