package day4;
import java.util.Scanner;

public class day4Pr5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int i=sc.nextInt();
		checkPositiveNumber c = new checkPositiveNumber();
		try
		{
			c.check(i);
		}
		
		
	}

}
class checkPositiveNumber
{
public void check(int i) throws Exception
{
	if(i<0)
	{
		throw new NotPositiveNumberException("Thrown Exception...!!");
	}
	else
	{
		System.out.println("Entered valid number...");
	}
}
}
class NotPositiveNumberException extends Exception
{
	String msg;
	public NotPositiveNumberException(String msg)
	{
		this.msg=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}
}
