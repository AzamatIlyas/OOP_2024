package Task5;

public class PhDStudent extends Person {

	private String study;
	private String sp;
	
	public PhDStudent(String name, int age, String study, String sp) {
		super(name,age);
		this.study = study;
		this.sp = sp;
	}
	
	@Override
	public String getOccupation() {
		return "Study in " + study;
	}
	
	public String toString() {
		return "Person [name=" + super.getName() + ", age=" + super.getAge() + ", pet=" + super.getAnimal() + "]" + ", occopation=study";
	}
	
	
}
