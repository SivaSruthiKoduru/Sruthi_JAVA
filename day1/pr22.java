package day1;

public class pr22 {
	public int i=90;
	protected int j=87;
	private int k=982;
	int l=928;
	
public static void main(String[] args) {
	other o = new other();
	o.method1();
	//o.method2();
	o.method3();
	o.method4();
	int a=o.i;
	int b=o.j;
	//int c=o.k;
	int d=o.l;
	System.out.println(a);
	System.out.println(b);
	System.out.println(d);
	
	
}

}
class other
{
	public int i=90;
	protected int j=87;
	private int k=982;
	int l=928;
	
	public void method1()
	{
		System.out.println("method1");
		
	}
	private void method2()
	{
		System.out.println("method2");
		
	}
	protected void method3()
	{
		System.out.println("method3");
	}
	void method4()
	{
		System.out.println("method4");
	}
	
	
	
	}