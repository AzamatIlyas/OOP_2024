package Task1;

public class Dog extends Animal{
	@Override
	public void voice() {
		System.out.println("Собака леат");
	}
	
	public Dog(int leg, String colour) {
		super(leg,colour);
	}
	
	public Dog( String colour) {
		super(colour);
	}
	
	public Dog(int leg) {
		super(leg);
	}
}
