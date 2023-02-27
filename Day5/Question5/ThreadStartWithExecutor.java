package Question5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadStartWithExecutor {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(() ->

		{

			System.out.println("Called once");
		});
		es.execute(() ->

		{

			System.out.println("Called twice");
		});

	}

}
