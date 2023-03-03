package day2;

public class day2Pr12 {
	public static void main(String[] args) {
		wipro Wipro[]=new wipro[3];
		Wipro[0]=new wiproTechnologies();
		Wipro[1]=new wiproInfotech();
		Wipro[2]=new wiproBPO();
		for(int i=0;i<=2;i++)
		{
			Wipro[i].template();
		}
		
		
				
		
		
		
		
		
	}
	

}
abstract class wipro
{
	abstract void recruitment();
	abstract void training();
	abstract void development();
	abstract void testing();
	abstract void deployment();
	void template()
	{
	    recruitment();
	    training();
	    development();
	    testing();
		deployment();
	}
	
}
class wiproTechnologies extends wipro
{
	public void recruitment()
	{
		System.out.println("wipro technologies recruitment");
	}
	public void training()
	{
		System.out.println("wipro technologies training");
	}
	public void development()
	{
		System.out.println("wipro technologies development");
	}
	public void testing()
	{
		System.out.println("wipro technologies testing");
	}
	public void deployment()
	{
		System.out.println("wipro technologies deployment");
	}
	
}
class wiproInfotech extends wipro
{
	public void recruitment()
	{
		System.out.println("wipro infotech recruitment");
	}
	public void training()
	{
		System.out.println("wipro infotech training");
	}
	public void development()
	{
		System.out.println("wipro infotech development");
	}
	public void testing()
	{
		System.out.println("wipro infotechs testing");
	}
	public void deployment()
	{
		System.out.println("wipro infotechs deployment");
	}
}
class wiproBPO extends wipro
{
	public void recruitment()
	{
		System.out.println("wipro BPO recruitment");
	}
	public void training()
	{
		System.out.println("wipro BPO training");
	}
	public void development()
	{
		System.out.println("wipro BPO development");
	}
	public void testing()
	{
		System.out.println("wipro BPO testing");
	}
	public void deployment()
	{
		System.out.println("wipro BPO deployment");
	}
}