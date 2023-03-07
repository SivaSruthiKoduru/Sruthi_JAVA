package Question10;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File file=new File("myfile.txt");
		if(file.delete())
		{
			System.out.println("File deleted successfully");
		}
		else
		{
			System.out.println("File deletion failed..........!!");
			System.out.println("Enter an existing file to delete");
		}
		
	}

}
