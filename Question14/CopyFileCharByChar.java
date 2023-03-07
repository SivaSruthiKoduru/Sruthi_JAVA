package Question14;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyFileCharByChar {
	public static void main(String[] args) {
		try(FileReader filereader = new FileReader("myfile.txt");FileWriter filewriter = new FileWriter("copied.txt");)
		{
		int i;
		while((i=filereader.read())!=-1)
		{
			filewriter.write(i);
		}
		System.out.println("File copied successfully..!!");
		
		}
		catch(Exception e)
		{
			System.out.println("Error in copying...");
		}
		
	}

}
