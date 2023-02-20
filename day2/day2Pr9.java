package day2;

public class day2Pr9 {
	public static void main(String[] args) {
		B b = new B();
		b.operate();
	}

}
class Ab
{
	public int i=10;
	private int j=50;
	protected int k=92;
	public void methodpublic()
	{
		System.out.println("inside public method");
	}
	private void methodprivate()
	{
		System.out.println("inside private method");
	}
	protected void methodprotected()
	{
		System.out.println("inside protected method");
	}	
}
class B extends Ab
{
	public void operate()
	{
		System.out.println(i);
		//System.out.println(j);
		System.out.println(k);
		methodpublic();
		methodprotected();
		//methodprivate();
	}
}