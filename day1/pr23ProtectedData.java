package day1;

public class pr23ProtectedData {
	protected int i;
	protected int j;
	protected void sum(int n,int m)
	{
		System.out.println(n+m);
	}
public static void main(String[] args){
	others o = new others();
	o.othermethod();
	
	
	 
	
	
}

}
class others
{
	void othermethod()
	{
		pr23ProtectedData pr =new pr23ProtectedData();
		pr.j=20;
		pr.i=90;
		pr.sum(pr.i,pr.j);
	}
}
