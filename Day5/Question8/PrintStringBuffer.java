package Question8;

public class PrintStringBuffer extends Thread{
	StringBuffer s;
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("A");
		PrintStringBuffer d1 = new PrintStringBuffer(s);
		PrintStringBuffer d2 = new PrintStringBuffer(s);
		PrintStringBuffer d3 = new PrintStringBuffer(s);
		d1.start();
		d2.start();
		d3.start();
		
		
		
		
		
	}
	PrintStringBuffer(StringBuffer s)
	{
		this.s=s;
		
	}
	public void run()
	{
		synchronized(s)
		{
			for(int i=0;i<100;i++)
			{
				System.out.print(s);
				
			}
			System.out.println();
			s.setCharAt(0,(char)(s.charAt(0)+1));
		}
	}

}
