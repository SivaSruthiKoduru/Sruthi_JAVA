package Question15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CopyFileLineByLIne {
	public static void main(String[] args) throws Exception{
		BufferedReader bufferedreader=null;
		PrintWriter printwriter=null;
		FileReader filereader=null;
		FileWriter filewriter=null;
		String line;
		try
		{
			filereader=new FileReader("myfile.txt");
			bufferedreader=new BufferedReader(filereader);
			filewriter=new FileWriter("lineCopy.txt");
			printwriter=new PrintWriter(filewriter);
			while((line=bufferedreader.readLine())!=null)
			{
				printwriter.println(line);
			}
			System.out.println("Copied Successfully..!!");
			
		}
		catch(Exception e)
		{
			System.out.println("Error copying...!!");
		}
		finally
		{
			bufferedreader.close();
			printwriter.close();
			filereader.close();
			filewriter.close();
			
			
			
		}
		
		
	}

}
