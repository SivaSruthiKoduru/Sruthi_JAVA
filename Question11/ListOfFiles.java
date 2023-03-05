package Question11;
import java.io.File;
public class ListOfFiles {
	static int i=0;
	public void printFiles(File[] a)
	{
		if(i==a.length)
		{
			return;
		}
		if(a[i].isFile())
		{
			System.out.println(a[i].getName());
		}
		i++;
		printFiles(a);
	}
	public static void main(String[] args) {
		String path=args[0];
		File file=new File(path);
		ListOfFiles listoffiles=new ListOfFiles();
		File a[]=file.listFiles();
		listoffiles.printFiles(a);	
	}

}
