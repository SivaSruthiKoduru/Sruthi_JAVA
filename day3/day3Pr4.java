package day3;
interface i1
{
	public void i1m1();
	public void i1m2();
	
}
interface i2
{
	public void i2m1();
	public void i2m2();
}
interface i3
{
	public void i3m1();
	public void i3m2();
	
}
interface newi extends i1,i2,i3
{
	public void newMethod();
}
class newClass implements newi
{
	public void method1(i1 a)
	{
		
	}
	public void method2(i2 b)
	{
		
	}
	public void method3(i3 c)
	{
		
	}
	public void method4(newMethod d)
	{
		
	}
}
public class day3Pr4 extends newClass{
	public static void main(String[] args) {
		newClass nc = new newClass();
		method1(nc);
		
		
	}

}
