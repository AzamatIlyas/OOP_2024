package Task1;

public class Student {
	private String name;
	private int year;
	private String id;
	
	// yearOfStudy
	public int yearOfStudy = 1;
	
	public Student(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	// getName
	void getName() {
		System.out.println("My name is "+name);
	}
	// getId
	void getId() {
		System.out.println("My id is "+id);
	}
	// incrementYearOfStudy
	void incrementYearOfStudy() {
		System.out.println(yearOfStudy+1);
	}
	
	// public String toString() {
}
