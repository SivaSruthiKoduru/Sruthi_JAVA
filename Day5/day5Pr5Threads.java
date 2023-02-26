package day5;

public class day5Pr5Threads {
	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadWork());
		thread.start();
		thread.start();
	}

}
class ThreadWork implements Runnable
{
	public void run()
	{
		System.out.println("called run");
	}
}
