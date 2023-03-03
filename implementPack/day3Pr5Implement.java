package implementPack;
import interfacePack.*;

public class day3Pr5Implement {
	public static void main(String[] args) {
		implementing i = new implementing();
		i.hello1();
		i.hello2();
		i.hello3();
	}

}
class implementing implements hello
{
	public void hello1()
	{
		System.out.println("inside hello1 ");
	}
	public void hello2()
	{
		System.out.println("inside hello2 ");
	}
    public void hello3()
	{
		System.out.println("inside hello3");
	}
}
