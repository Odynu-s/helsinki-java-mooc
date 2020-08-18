
public class Student implements Comparable<Student> {
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public int compareTo(Student student) {
		return this.name.compareTo(student.name);
	}
	
	public String toString() {
		return this.name;
	}

}
