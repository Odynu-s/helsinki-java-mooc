package javaMOOCWeek6;

public class Book {
	
	//variables
	private String title;
	private String publisher;
	private int year;
	
	//constructors
	
	public Book(String title, String publisher, int year) {
		this.title = title;
		this.publisher = publisher;
		this.year = year;
	}
	
	public String title() {
		return this.title;
	}
	
	public String publisher() {
		return this.publisher;
	}
	
	public int year() {
		return this.year;
	}
	
	public String toString() {
		return title + ", " + publisher + ", " + year;
	}
	
	

}
