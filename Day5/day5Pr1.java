package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class day5Pr1 {
	public static void main(String[] args) {
		OddEven oe= new OddEven();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(()->
		{  synchronized(oe) {
			System.out.println("Odd Numbers");
			oe.printOdd();
		}
			
		}
		);
		
		es.execute(()->
		{
			synchronized(oe) {
			System.out.println("\nEven Numbers");

			oe.printEven();
			}
			
		}
		);
		es.shutdown();
		
		
	}
	
			

}
class OddEven
{
	static int i=1;
	static int j=1;
	 public void printOdd()
	{
		while(i<=100)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
			
			i++;
			
		}
	}
	public void printEven()
	{
		while(j<=100)
		{
			if(j%2==0)
			{
				System.out.print(j+" ");
			}
			
			
			j++;
			
		}
		}
	}

