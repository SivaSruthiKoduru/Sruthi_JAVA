package Question2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FormatMessage {
	public static void main(String[] args) {
		work w = new work();
		ExecutorService es = Executors.newFixedThreadPool(3);
		es.execute(()->
		{
			synchronized(w) {
			w.display("1st message");
			}
			
		});
		es.execute(()->
		{
			synchronized(w) {
			w.display("2nd message");
			}
		});
		es.execute(()->
		{
			synchronized(w) {
			w.display("3rd message");
			}
		});
		es.shutdown();
		
	}

}
class work
{
	

	public void display(String msg)
	{
		System.out.print("\"[------"+msg+"------]\"\n");
		try 
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			
		}
	}
	
}
