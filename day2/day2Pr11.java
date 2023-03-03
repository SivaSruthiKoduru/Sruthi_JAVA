package day2;

public class day2Pr11 {
	public static void main(String[] args) {
		CcC c = new CcC(2,3);
		
	}
	

}
class AaA{
	AaA(int a){
		System.out.println(a);
	}
	
}
class BbB
{
	BbB(int b)
	{
		System.out.println(b);
	}
}
class CcC extends AaA{
	CcC(int i,int j)
	{
	 
	 super(i);
	 BbB bb = new BbB(j);
	 
	 
	}
	
	
}
