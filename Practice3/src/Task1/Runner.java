package Task1;

public class Runner {

	public static void main(String[] args) {
		Dog dog = new Dog(4,"black");
		
		dog.voice();
		
		System.out.println("Количество ног "+dog.countOfLegs);

	}

}
