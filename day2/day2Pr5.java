package day2;

public class day2Pr5 {
	static int i;
	day2Pr5()
	{
		i++;
	}
	public static void main(String[] args)
	{
		day2Pr5 d1=new day2Pr5();
		day2Pr5 d2=new day2Pr5();
		day2Pr5 d3=new day2Pr5();
		day2Pr5 d4=new day2Pr5();
		d4.count();
		
	}
	public void count()
	{
		System.out.println(i);
	}
}
