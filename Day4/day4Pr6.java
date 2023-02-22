package day4;

import java.io.FileReader;
public class day4Pr6 {
	public static void main(String[] args) throws Exception {
		FileReader fileReader = new FileReader("no.txt");
		System.out.println(fileReader.read());
		fileReader.close();
	
	}


}
class Deriv extends day4Pr6
{
	Deriv()
	{
		super();
		try
		{
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}