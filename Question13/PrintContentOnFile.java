package Question13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PrintContentOnFile 
{
	public static void main(String[] args) {
		File file= new File("myfile.txt");
		String line=null;
		try
		{
			FileReader filereader = new FileReader(file);
			BufferedReader bufferedreader=new BufferedReader(filereader);
			while((line=bufferedreader.readLine())!=null)
			{
				System.out.println(line);
			}
			bufferedreader.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Failed to display");
			e.printStackTrace();
		}
	}
}
