package dictionary;

import java.util.*;
import java.io.*;

public class MindfulDictionary {
	
	private Map<String, String> dict;
	private File file;
	private Scanner reader;
	
	
	public MindfulDictionary() {
		this.dict = new HashMap<String, String>();
	}
	
	public MindfulDictionary(String file) {
		this.dict = new HashMap<String, String>();
		this.file = new File(file);
		try {
			this.reader = new Scanner(this.file);
		} catch (Exception e) {
			System.out.println("File not found.");
		}
	}
	
	public void add(String word, String translation) {
		if (!dict.containsKey(word)) {
			dict.put(word, translation);
		}
	}
	
	public String translate(String word) {
		if (dict.containsKey(word)) {
			return dict.get(word);
		}
		if (dict.containsValue(word)) {
			return getKeyByValue(dict, word);
		}
		return null;
	}

	public void remove(String word) {
		dict.remove(word);
		String key = getKeyByValue(dict, word);
		dict.remove(key);
	}

	public <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
	
	public boolean load() {
		if (!reader.hasNextLine()) {
			return false;
		}
		while (this.reader.hasNextLine()) {
			String line = reader.nextLine();
			String[] parts = line.split(":");
			add(parts[0], parts[1]);
		}
		return true;
	}

	public boolean save() {
        try {
            FileWriter writer = new FileWriter(this.file);
            for (String key : this.dict.keySet()) {
                writer.write(key + ":" + this.dict.get(key) + "\n");
            }
            writer.close();
            return true;
            
        } catch (IOException e) {
            return false;
        }
    }
	
	
	
	


}