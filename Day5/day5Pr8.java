package day5;

public class day5Pr8 extends Thread{
	StringBuffer s;
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("A");
		day5Pr8 d1 = new day5Pr8(s);
		day5Pr8 d2 = new day5Pr8(s);
		day5Pr8 d3 = new day5Pr8(s);
		d1.start();
		d2.start();
		d3.start();
		
		
		
		
		
	}
	day5Pr8(StringBuffer s)
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
