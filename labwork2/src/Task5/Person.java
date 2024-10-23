package Task5;

import java.util.Objects;

public abstract class Person {
	
	private String name;
	private int age;
	private Animal pet;
	private boolean someonesPet;
	private boolean givePet;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		someonesPet = false;
		givePet = false;
	}
	
	
	
	public boolean isGivePet() {
		return givePet;
	}

	public void setGivePet(boolean givePet) {
		this.givePet = givePet;
	}

	public Animal getAnimal() {
		return pet;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public boolean getSomeonesPet() {
		return someonesPet;
	}
	
	public void setSomeonesPet(boolean b) {
		this.someonesPet = b;
	}

	public void assignPet(Animal pet) {
		if(pet instanceof Dog && this instanceof PhDStudent) {
			System.out.println("PhD Student can not assign dog !!!");
			return;
		}
		this.pet = pet;
	}
	
	public void removePet() {
		this.pet = null;
	}
	
	public boolean hasPet() {
		if(pet != null) {
			return true;
		}
		return false;
	}
	
	public abstract String getOccupation();
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", pet=" + pet + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	public void leavePetWith(Person p) {
		if(!this.hasPet()) {
			System.out.println(name+" has not pet");
			return;
		}
		
		if(p.getAnimal() instanceof Dog && p instanceof PhDStudent) {
			System.out.println("This is not available");
			return;
		}
		
		if(p.hasPet()) {
			System.out.println("This is not available");
			return;
		}
		
		p.assignPet(this.getAnimal());
		this.removePet();
		p.setSomeonesPet(true);
		this.setGivePet(true);
	}
	
	public void retrievePetFrom(Person p) {
		
		if(p.getSomeonesPet() && this.isGivePet()) {
			this.assignPet(p.getAnimal());
			p.removePet();
			p.setSomeonesPet(false);
			this.setGivePet(false);
			
			return;
		}
		
		System.out.println("This is not available");
		
	}
	
}
