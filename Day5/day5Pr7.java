package day5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class day5Pr7 {
	
	static int i = 1;

	public static void main(String[] args) {
		day5Pr7 d = new day5Pr7();
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
