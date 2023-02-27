package Question7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountingThread{
	
	static int i = 1;

	public static void main(String[] args) {
		CountingThread d = new CountingThread();
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(() -> {
			for (int i = 1; i <= 100; i++) {
				d.countNum();
			}
		});
	}

	synchronized public void countNum() {
		Thread t = Thread.currentThread();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		System.out.println(i);

		if (i % 10 == 0) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println("Message");

		}
		i++;
	}

}
