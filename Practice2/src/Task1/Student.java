package Task1;

public class Student {
	private String name;
	private String id;
	
	// yearOfStudy
	public int yearOfStudy = 1;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
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
