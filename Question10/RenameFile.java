package Question10;
import java.util.Scanner;
import java.io.File;

public class RenameFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("reanmed.txt");
		System.out.println("Enter a name to rename");
		String s=sc.next();
		File file2 = new File(s);
		if(file.renameTo(file2))
		{
			System.out.println("Renamed File successfully");
		}
		else
		{
			System.out.println("Renaming failed..........!!");
			System.out.println("Enter an existing file name");
		}
		
		
		
	}

}
