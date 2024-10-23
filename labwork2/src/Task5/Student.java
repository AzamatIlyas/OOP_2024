package Task5;

public class Student extends Person {
	
	private String faculty;
	
	public Student(String name, int age, String study) {
		super(name,age);
		this.faculty = study;
	}
	
	@Override
	public String getOccupation() {
		return "Study in " + faculty;
	}
	
	public String toString() {
		return "Person [name=" + super.getName() + ", age=" + super.getAge() + ", pet=" + super.getAnimal() + "]" + ", occopation=study";
	}
	
}
