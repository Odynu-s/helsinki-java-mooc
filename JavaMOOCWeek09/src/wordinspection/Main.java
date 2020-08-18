package wordinspection;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		File file = new File("src/wordInspection/shortList.txt");
		WordInspection wi = new WordInspection(file);
		System.out.println(wi.wordCount());
		System.out.println(wi.wordsContainingZ());
		System.out.println(wi.wordsEndingInL());
		System.out.println(wi.palindromes());
		System.out.println(wi.wordsWhichContainAllVowels());
		
	}

}
