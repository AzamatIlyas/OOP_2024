package Task1;

public abstract class Animal {
	public int countOfLegs;
	public String color;
	
	public Animal(int countOfLegs) {
		this.countOfLegs = countOfLegs;
	}
	
	public Animal(int countOfLegs, String color) {
		this.color = color;
		this.countOfLegs = countOfLegs;
	}
	
	public Animal(String color) {
		this.color = color;
	}
	
	public abstract void voice() ;
}
