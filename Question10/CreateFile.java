package Question10;

import java.io.File;

public class CreateFile {
	public static void main(String[] args) {
		File file = new File("myfile.txt");
		boolean result;
		try
		{
			result=file.createNewFile();
			if(result)
			{
				System.out.println("File created Successfully");
			}
			else
			{
				System.out.println("File exists");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
