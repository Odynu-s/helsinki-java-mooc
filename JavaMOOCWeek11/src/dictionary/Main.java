package dictionary;

public class Main {
	public static void main(String[] args) {
		MindfulDictionary dict = new MindfulDictionary("src/dictionary/file.txt");
		dict.load();

		// using the dictionary

		dict.save();
	}
}