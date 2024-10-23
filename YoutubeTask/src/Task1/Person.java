package Task1;

public abstract class Person {
	
	public String gender;
	
	public Person(String gender) {
		this.gender = gender;
	}
	
	public abstract int getSalary();
}
