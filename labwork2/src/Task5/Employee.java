package Task5;

public class Employee extends Person {
	
	private String work;
	
	public Employee(String name, int age, String work) {
		super(name,age);
		this.work = work;
	}
	
	@Override
	public String getOccupation() {
		return this.work;
	}
	
	public String toString() {
		return "Person [name=" + super.getName() + ", age=" + super.getAge() + ", pet=" + super.getAnimal() + "]" + ", occopation="+this.work;
	}
	
}
