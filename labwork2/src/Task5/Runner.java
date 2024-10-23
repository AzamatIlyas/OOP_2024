package Task5;

public class Runner {

	public static void main(String[] args) {
		Person john = new Employee("John", 30, "Engineer");
		Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
		Person aza = new Employee("Aza", 18, "Engineer");
		
		Animal Rex = new Dog("GGG", 5);
		Animal murka = new Cat("Murka", 5);
		john.assignPet(murka); // John owns Rex
		aza.assignPet(Rex);
		
		PersonRegistry registry = new PersonRegistry();
		registry.addPerson(john);
		registry.addPerson(alice);
		registry.addPerson(aza);
		System.out.println(registry);
		// John goes on vacation and leaves Rex with Alice
		john.leavePetWith(alice);
		aza.leavePetWith(alice);
		// Registry reflects that Alice is taking care of Rex
		System.out.println(registry);
		// John returns from vacation and retrieves Rex
		john.retrievePetFrom(alice);
		// Registry reflects that John has his dog back
		System.out.println(registry);

	}

}
