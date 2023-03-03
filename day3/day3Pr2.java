package day3;
import java.util.Scanner;
interface calcArea
{
	public void area();
	
}
interface calcVolume
{
	public void volume();
}
interface calcPeri
{
	public void perimeter();
}
interface calcSA
{
	public void surface();
}
class circle implements calcArea,calcPeri
{
	public float r;
	
	public void area()
	{
		System.out.println("Enter radius");
		Scanner sc=new Scanner(System.in);
	    r=sc.nextFloat();
		
		float a=3.14f*r*r;
		System.out.println("AREA : "+a);
	}
	public void perimeter()
	{
		float p=2*r*3.14f;
		System.out.println("PERIMETER: "+p);
	}
	
}
class square implements calcArea,calcPeri
{
	public float s;
	public void area()
	{
		System.out.println("Enter side");
		Scanner sc= new Scanner(System.in);
		s=sc.nextFloat();
		float ar=s*s;
		System.out.println("AREA: "+ar);
	}
	public void perimeter()
	{
		float p=4*s;
		System.out.println("PERIMETER: "+p);
	}
}
class triangle implements calcArea,calcPeri
{
	Scanner sc= new Scanner(System.in);
	public int s1,s2,s3;
	public void area()
	{
		System.out.println("Enter height");
		int h=sc.nextInt();
		System.out.println("enter base");
		int b=sc.nextInt();
		float area=0.5f*b*h;
		System.out.println("AREA: "+area);
		
		
		
	}
	public void perimeter()
	{
		
		System.out.println("enter side 1");
		s1=sc.nextInt();
		System.out.println("enter side 2");
		s2=sc.nextInt();
		System.out.println("enter side 3");
		s3=sc.nextInt();
		int peri=s1+s2+s2;
		System.out.println("PERIMETER: "+peri);
	}
}
class sphere implements calcArea,calcVolume,calcSA,calcPeri
{
	Scanner sc = new Scanner(System.in);
	public float r;
	public void area()
	{
		System.out.println("Enter radius");
		r=sc.nextFloat();
		float a=3.14f*r*r;
		System.out.println("AREA: "+a);
	}
	public void perimeter()
	{
		float p=2*3.14f*r;
		System.out.println("PERIMETER: "+p);	
	}
	public void surface()
	{
		double sa=4*3.14*r*r;
		System.out.println("SURFACE AREA: "+sa);
		
		
	}
	public void volume()
	{
		double v=(4/3)*3.14f*r*r;
		System.out.println("VOLUME: "+v);
	}
	
	
	
}
class cuboid implements calcArea,calcVolume,calcSA,calcPeri
{
	Scanner sc = new Scanner(System.in);
	public int s;
	public void perimeter()
	{
		System.out.println("Enter side");
		s=sc.nextInt();
		int p=4*s;
		System.out.println("PERIMETER: "+p);
	}
	public void area()
	{
		int a=s*s;
		System.out.println("AREA: "+a);
		
	}
	public void surface()
	{
		int sur=6*s*s;
		System.out.println("SURFACE AREA: "+sur);
		
	}
	public void volume()
	{
		int v=s*s*s;
		System.out.println("VOLUME: "+v);
		
	}
	
	
}
public class day3Pr2 {
	public static void main(String[] args) {
		circle c= new circle();
		square s=new square();
		triangle t = new triangle();
		sphere sp = new sphere();
		cuboid cb=new cuboid();
		System.out.println("Enter choice");
		System.out.println("1.circle");
		System.out.println("2.square");
		System.out.println("3.triangle");
		System.out.println("4.sphere");
		System.out.println("5.cuboid");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			c.area();
		    c.perimeter(); 
		    break;
		case 2:
			s.area();
			s.perimeter();
			break;
		case 3:
			t.area();
			t.perimeter();
			break;
		case 4:
			sp.area();
			sp.perimeter();
			sp.surface();
			sp.volume();
			break;
		case 5:
			cb.perimeter();
			cb.area();
			
			cb.surface();
			cb.volume();
			break;
			
		    	
		
		}
		
		
	
	}

}
