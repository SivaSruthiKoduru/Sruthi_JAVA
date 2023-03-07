package Question10;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileSize {
	public static void main(String[] args) throws IOException {
		File file = new File("myfile.txt");
		if(!file.exists())
		{
			System.out.println("Enter an existing file to fing size");
		}
		else
		{
			System.out.println(Files.size(Paths.get("/Users/sivasruthikoduru/eclipse-workspace/IOStreams/myfile.txt")));
		}
	}

}

