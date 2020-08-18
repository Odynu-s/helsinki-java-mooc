package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
	private List<Person> employees;
	
	public Employees() {
		employees = new ArrayList<Person>();
	}
	
	public void add(Person person) {
		employees.add(person);
	}
	
	public void add(List<Person> persons) {
		Iterator<Person> iterator = persons.iterator();
		while (iterator.hasNext()) {
			employees.add(iterator.next());
		}
	}
	
	public void print() {
		Iterator<Person> iterator = employees.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void print(Education education) {
		Iterator<Person> iterator = employees.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getEducation() == education) {
				System.out.println(iterator.next());
			}
		}
	}
	
	public void fire(Education education) {
		Iterator<Person> iterator = employees.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getEducation() == education) {
				iterator.remove();
			}
		}
	}
	
	

}
