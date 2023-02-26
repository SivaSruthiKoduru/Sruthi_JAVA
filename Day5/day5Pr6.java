package day5;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class day5Pr6 {
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		CheckAlphaClass cac = new CheckAlphaClass();
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(()->
		{
			while(true)
			{
				try {
				cac.checkAlphaMethod();
				}
				catch(Exception e)
				{
					
				}
			}
		});
		
	}
	
}
class CheckAlphaClass
{
	static int i=0;
	Scanner sc = new Scanner(System.in);
	public void checkAlphaMethod() throws Exception
	{
		System.out.println("Enter an alphabet:");
		String str=sc.next();
		
		try 
		{
			checkChar(str);
			i++;
			System.out.println("Alpha count="+i);
		}
		catch(NotACharException e)
		{
			System.out.println("Please enter a single character...");
		}
		catch(NotAnAlphaException e)
		{
			System.out.println("Please enter an alphabet...");
		}
		
		
		
		
		
	}
	public void checkChar(String str) throws Exception
	{
		char c=str.charAt(0);
		if(str.length()>=2)
		{
			throw new NotACharException("Not a character exception caught....");
		}
		else if(isNotAlpha(c))
		{
			throw new NotAnAlphaException("Not an alphabet exception caught...");
		}

			
		
	}
	public boolean isNotAlpha(char c)
	{
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
		{
			return false;
		}
		else
		{
		return true;
		}
	}
}
class MyException extends Exception
{
	
}
class NotACharException extends MyException
{
	String msg;
	public NotACharException(String msg)
	{
		this.msg=msg;
	}
	public String toString() {
		return msg;
	}
}
class NotAnAlphaException extends MyException
{
	String msg;
	public NotAnAlphaException(String msg)
	{
		this.msg=msg;
	}
	public String toString() {
		return msg;
	}
}
