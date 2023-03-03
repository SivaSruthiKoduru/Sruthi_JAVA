package day2;

public class day2Pr8 {
	public static void main(String[] args) {
		Abcd a = Abcd.getInstance();
		System.out.println(a);
		Abcd b = Abcd.getInstance();
		System.out.println(b);
		
	}

}
class Abcd{
	private Abcd() {
		
	}
	private static Abcd abcd;
	public static Abcd getInstance()
	{
		if(abcd==null)
		{
			abcd=new Abcd();
			return abcd;
		}
		else
		{
			return abcd;
		}
	}
}