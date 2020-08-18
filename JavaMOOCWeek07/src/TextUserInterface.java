import java.util.*;

public class TextUserInterface {
	
	Scanner reader;
	Dictionary dictionary;
	
	public TextUserInterface(Scanner reader, Dictionary dictionary) {
		this.reader = reader;
		this.dictionary = dictionary;
	}
	
	public void start() {
		String command;
		System.out.println("Statements:\n" + 
				"  add - adds a word pair to the dictionary\n" + 
				"  translate - asks a word and prints its translation\n" + 
				"  quit - quits the text user interface");
		while (true) {
			System.out.println("Please give a command!");
			command = this.reader.nextLine();
			if (command.equals("quit")) {
				System.out.println("Sarabata");
				break;
			} else if (command.equals("add")) {
				add();
			} else if (command.equals("translate")) {
				translate();
			}else {
				System.out.println("Unknown statement. Please try again.");
			}
		}	
	}
	
	public void add() {
		System.out.println("Please give a pair of words. First in Serbian, then in English");
		String key = reader.nextLine();
		String translation = reader.nextLine();
		dictionary.add(key, translation);
	}
	
	public void translate() {
		System.out.println("Please input a word to translate");
		System.out.println(dictionary.translate(this.reader.nextLine()));
	}
}
