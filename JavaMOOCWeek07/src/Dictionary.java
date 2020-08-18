import java.util.*;

public class Dictionary {
	
	private HashMap<String, String> translations;
	
	public Dictionary() {
		this.translations = new HashMap<String, String>();
	}
	
	public String translate(String word) {
		if (this.translations.containsKey(word)) {
			return translations.get(word);
		}
		return null;
	}
	
	public void add(String word, String translation) {
		if (this.translations.containsKey(word)) {
			System.out.println("The dictionary already contains this word!");
		}else {
			this.translations.put(word, translation);
		}
	}
	
	public int amountOfWords() {
		return this.translations.size();
	}
	
	public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();
        for (String key : this.translations.keySet()) {
            list.add(key + " = " + this.translations.get(key));
        }
        return list;
    }

}
