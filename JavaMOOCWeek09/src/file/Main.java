package file;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		File file = new File("src/file/testfile.txt");
	    Analysis analysis = new Analysis(file);
	    System.out.println("Lines: " + analysis.lines());
	    System.out.println("Characters: " + analysis.characters());

	}

}
