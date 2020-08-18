import java.util.*;

public class Person implements Comparable<Person> {
	private String name;
	private int salary;
	
	public Person(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSalary() {
		return this.salary;
	}

	public String toString() {
		return this.name + " (" + this.salary + " euros)";
	}
	
	public int compareTo(Person person) {
		return person.salary - this.salary;
		
	}
}
