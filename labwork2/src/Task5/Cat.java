package Task5;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void getSound() {
		System.out.println("Cat meows");
	}
	
}
