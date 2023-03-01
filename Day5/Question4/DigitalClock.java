package Question4;

import java.util.concurrent.ExecutorService;
import java.time.LocalTime;
import java.util.concurrent.Executors;

public class DigitalClock{
	public static void main(String[] args) {
		Clock clock = new Clock();
			ExecutorService executorservice = Executors.newFixedThreadPool(3);
			executorservice.execute(()->
			{
				while(true)
				{
					
					try
					{
						clock.displaySeconds();
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			});
			executorservice.execute(()->
			{
				
				while(true)
				{
					
					try
					{
						clock.displayMinutes();
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				
			});
			executorservice.execute(()->
			{
				while(true)
				{
					
					try
					{
						clock.displayHours();
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				
				
			});
			
		
		
	}

}
