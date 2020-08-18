package javaMOOCWeek6;

public class StringUtils {
	
	public static boolean included(String word, String searched) {
		word = word.trim().toLowerCase();
		searched = searched.trim().toLowerCase();
		boolean value = false;
		if (word.contains(searched)) {
			value = true;
		}
		return value;
	}
}
