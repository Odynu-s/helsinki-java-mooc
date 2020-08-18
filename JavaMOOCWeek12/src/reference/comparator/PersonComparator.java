package reference.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import reference.domain.Person;

public class PersonComparator implements Comparator<Person> {
	private Map<Person, Integer> map;

	public PersonComparator(Map<Person, Integer> peopleIdentities) {
		this.map = peopleIdentities;
	}

	@Override
	public int compare(Person o1, Person o2) {
		return map.get(o2)-map.get(o1);
	}
}
