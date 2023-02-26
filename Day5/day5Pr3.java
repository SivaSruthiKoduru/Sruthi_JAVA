package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class day5Pr3 {
	public static void main(String[] args) {
		ProducerConsumer p=new ProducerConsumer();
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.execute(()->
		{
			for(int i=0;i<5;i++)
			{
				
				p.producer();
			}
		
			
		});
		es.execute(()->
		{
			for(int i=0;i<5;i++)
			{
				
				p.consumer();
			}
		});
	}

}
class ProducerConsumer{
	int item=0;
	 synchronized public void producer() {
		if(item==1) 
		{
			try
			{
				wait();
			
			}catch(Exception e)
			{
				
			}
		}
		item=item+1;
		System.out.println("Producer produced item "+item);
		notify();
	}
	
	 synchronized public void consumer() {
		if(item==0)
		{
			
			try
			{
				wait();
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("Consumer consumed item "+item);
		item=item-1;
		notify();
	}
}
