package file;
import java.io.*;
import java.util.*;

public class Analysis {
	
	private File file;
	private Scanner reader;
	private ArrayList<String> list = new ArrayList<String>();
	
	public Analysis(File file) throws FileNotFoundException {
		this.file = file;
		this.reader = new Scanner(file);
		while (reader.hasNextLine()) {
			this.list.add(reader.nextLine());
		}
	}
	
	public int lines() throws Exception {
		return list.size();
	}
	
	public int characters() throws Exception {
		int temp = this.lines();
		for (String string: list) {
			temp += string.length();
		}
		return temp;
	}
}
