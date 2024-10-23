package Task1;

public class Accountant extends Office{
	
	public int salary;
	
	public Accountant(String gender) {
		super(gender);
		this.salary = 50000;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void calculateTaxes() {
		System.out.println("Считает налоги");
	}
}
