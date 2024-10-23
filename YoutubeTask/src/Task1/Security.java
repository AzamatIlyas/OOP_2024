package Task1;

public class Security extends Person {
	public int salary;
	
	public Security(String gender) {
		super(gender);
		this.salary = 15000;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void keeping() {
		System.out.println("Сторожает территорию");
	}
}
