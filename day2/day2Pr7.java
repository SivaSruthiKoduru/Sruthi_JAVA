package day2;

public class day2Pr7 {
	public static void main(String[] args) {
		final finalObject fo = new finalObject(10,"finalobj");
		fo.str="newstr";
		
	}
	
	
	

}
class finalObject
{
String str;
finalObject(int a,String name)
{
	System.out.println(a);
	System.out.println(name);
	System.out.println(str);
}

}
