package dictionary;

import java.util.*;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
	private Map<String, Set<String>> dictionary;
	
	public PersonalMultipleEntryDictionary() {
		this.dictionary = new HashMap<String, Set<String>>();
	}

	@Override
	public void add(String word, String entry) {
		if (!this.dictionary.containsKey(word)) {
			dictionary.put(word, new HashSet<String>());
		}
		dictionary.get(word).add(entry);
	}

	@Override
	public Set<String> translate(String word) {
		if (!dictionary.containsKey(word)) {
			return null;
		}else {
			return dictionary.get(word);
		}
	}

	@Override
	public void remove(String word) {
		if (dictionary.containsKey(word)) {
			dictionary.remove(word);
		}
		// TODO Auto-generated method stub

	}

}
