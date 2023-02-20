package day1;

public class pr25 {
	protected class base
	{
		String Method()
		{
			return "WOW";
		}
	}
	class derived
	{
		public void useD()
		{
			base z=new base();
			System.out.println("base says, "+z.Method());
		}
	}

	public static void main(String[] args) {
		pr25 p =new pr25();
		pr25.derived d=p.new derived();
		d.useD();
		
		
	}

}


