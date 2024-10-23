package Task1;

public class Secretary extends Office{
	
	public int salary;
	
	public Secretary(String gender) {
		super(gender);
		this.salary = 30000;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void printDoc() {
		System.out.println("Печатает документы");
	}
}
