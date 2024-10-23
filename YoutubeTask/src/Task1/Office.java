package Task1;

public abstract class Office extends Person {
	
	public Office(String gender) {
		super(gender);
	}
	
	public void drink() {
		System.out.println("Умеет пить кофе");
	}
	
	
	public abstract int getSalary();
}
