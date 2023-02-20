package day1;
import java.util.Scanner;

public class pr21NoOfDays {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter month");
		String month=sc.next();
		switch(month)
		{
		case "january":
			System.out.println("31 days");
			break;
		case "february":
			System.out.println("enter year");
			int y=sc.nextInt();
			if(((y%4==0)&&y%100!=0)||(y%400==0))
			{
			System.out.println("29 days");
			}
			else 
			{
				System.out.println("28 days");
			}
			break;
		case "march":
			System.out.println("31 days");
			break;
		case "april":
			System.out.println("30 days");
			break;
		case "may":
			System.out.println("30 days");
			break;
		case "june":
			System.out.println("30 days");
			break;
		case "july":
			System.out.println("31 days");
			break;
		case "august":
			System.out.println("31 days");
			break;
		case "september":
			System.out.println("30 days");
			break;
		case "october":
			System.out.println("31 days");
			break;
		case "november":
			System.out.println("30 days");
			break;
		case "december":
			System.out.println("31 days");
			break;
			
		}
		
	}

}
