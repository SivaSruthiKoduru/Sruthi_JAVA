package Question16;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class WriteDateToFile {
	public static void main(String[] args) {
		Date date= new Date();
		String dateString=date.toString();
		
		try(FileWriter fileWriter=new FileWriter("dateWrite.txt");)
	    {
			fileWriter.write(dateString);
			System.out.println("Written date to file successfully..!");
		}
		catch(Exception e)
		{
			System.out.println("Writing date object failed..1");
		}
		try(FileReader fileReader=new FileReader("dateWrite.txt");
				BufferedReader bufferedReader=new BufferedReader(fileReader);)
		{
			System.out.println(bufferedReader.readLine());
		}
		catch(Exception e)
		{
			System.out.println("Reading date from file failed...!");
		}
	}

}
