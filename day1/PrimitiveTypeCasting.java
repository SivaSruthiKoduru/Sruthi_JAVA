package day1;

public class PrimitiveTypeCasting {
	public static void main(String[] args) {
		int i=12;
		byte b=90;
		short s=987;
		long l=7890298L;
		float f=8933.38F;
		double d=73892839.93D;
		boolean z=false;
		char c='f';
		i=-2147483648;
		i=2147483647;
		//i='a';
		System.out.println(i);
		//i=987654323456789;
		s=-32768;
		s=32767;
		//s=32768;
		//s='a';
		System.out.println(s);
		l=9223372036854775807L;
		//l='a';
		System.out.println(l);
		f=2.456f;
		f=-234.9f;
		//f='b';
		System.out.println(f);
		d=838392992929921112.82D;
		d='b';
		System.out.println(d);
		z=true;
		//z=0;
		System.out.println(z);
		c='a';
		c=97;
		c=83;
		System.out.println(c);
		System.out.println("..........");
		l=i;
		f=i;
		d=i;
		c=(char)i;//explict
		//s=(short)i;
		b=(byte)i;
		System.out.println(b);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(s);
		System.out.println("..........");
		i=s;
		l=s;
		f=s;
		d=s;
		c=(char)s;
		b=(byte)b;
		System.out.println(i);
		System.out.println(b);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println("..........");
		i=b;
		s=b;
		f=b;
		d=b;
		c=(char)b;
		System.out.println(".........");
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
