
public class Student {
	
	private String name;
	private String studentNumber;
	
	public Student(String name, String studentNumber) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.studentNumber = studentNumber;
	}	
	

	public String getName() {
		return this.name;
	}
	
	public String getStudentNumber() {
		return this.studentNumber;
		
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return (getName() + "(" + getStudentNumber() + ")");
	}
}
