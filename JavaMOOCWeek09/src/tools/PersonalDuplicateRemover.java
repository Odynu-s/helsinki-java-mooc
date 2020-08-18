package tools;

import java.util.Set;
import java.util.HashSet;

public class PersonalDuplicateRemover implements DuplicateRemover {
	private Set<String> entries = new HashSet<String>();
	private int dupecount = 0;

	@Override
	public void add(String characterString) {
		if (!this.entries.add(characterString)) {
			this.dupecount++;
		}

	}

	@Override
	public int getNumberOfDetectedDuplicates() {
		return this.dupecount;
	}

	@Override
	public Set<String> getUniqueCharacterStrings() {
		return this.entries;
	}

	@Override
	public void empty() {
		entries.clear();
		this.dupecount = 0;

	}

}
