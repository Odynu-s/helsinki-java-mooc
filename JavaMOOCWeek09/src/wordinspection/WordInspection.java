package wordinspection;

import java.io.*;
import java.util.*;

public class WordInspection {
	
	private File file;
	private Scanner reader;
	private ArrayList<String> wordlist = new ArrayList<String>();
	
	public WordInspection(File file) throws Exception {
		this.file = file;
		this.reader = new Scanner(file);
		while (reader.hasNextLine()) {
			wordlist.add(reader.nextLine());
		}
		reader.close();
	}
	
	public int wordCount() {
		return wordlist.size();
	}
	
	public List<String> wordsContainingZ(){
		ArrayList<String> templist = new ArrayList<String>();;
		for (String string: wordlist) {
			if (string.contains("z")) {
				templist.add(string);
			}
		}
		return templist;
	}
	
	public List<String> wordsEndingInL(){
		char c = 'l';
		ArrayList<String> templist = new ArrayList<String>();
		for (String string: wordlist) {
			if (string.charAt(string.length()-1) == c) {
				templist.add(string);
			}
		}
		return templist;
	}
	
	public List<String> palindromes(){
		ArrayList<String> templist = new ArrayList<String>();
		for (String string: wordlist) {
			if (isPalindrome(string)) {
				templist.add(string);
			}
		}
		return templist;
	}
	
	public boolean isPalindrome(String word) {
		int n = word.length();
		for (int i = 0; i < n/2; i++) {
			if (word.charAt(i) != word.charAt(n-i-1)) {
				return false;
			}	
		}
		return true;
	}

	public List<String> wordsWhichContainAllVowels(){
		ArrayList<String> templist = new ArrayList<String>();
		for (String string: wordlist) {
			if (string.contains("a") && string.contains("e") && string.contains("i") && string.contains("o") && string.contains("y") && string.contains("ä") && string.contains("ö")) {
				templist.add(string);
			}
		}
		return templist;
		
	}
}


















