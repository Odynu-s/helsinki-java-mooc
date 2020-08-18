package exercise34;
import java.util.*;
import java.io.*;

public class FileManager {
	
	public ArrayList<String> read(String file) throws FileNotFoundException{
		File file1 = new File(file);
		ArrayList<String> templist = new ArrayList<String>();
		Scanner scanner = new Scanner(file1);
		while (scanner.hasNextLine()) {
			templist.add(scanner.nextLine());
		}
		return templist;
	}
	
	public void save(String file, String text) throws IOException {
		File file1 = new File(file);
		FileWriter writer = new FileWriter(file1);
		writer.write(file);
		writer.close();
	}
	
	public void save(String file, ArrayList<String> texts) throws IOException {
		File file1 = new File(file);
		FileWriter writer = new FileWriter(file1);
		for (String string: texts) {
			writer.write(string);
			writer.write("\n");
		}
		writer.close();
	}
}
