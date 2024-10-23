package Task5;

import java.util.*;

public class PersonRegistry {
	
	private Vector<Person> people = new Vector<>();
	
	public void addPerson(Person p) {
		people.add(p);
	}
	
	public void removePerson(Person p) {
		people.remove(p);
	}
	
	public Vector<Person> peopleWithPet(){
		Vector<Person> peopleWithPet = new Vector<>();
		for(Person p : people) {
			if(p.hasPet()) {
				peopleWithPet.add(p);
			}
		}
		return peopleWithPet;
	}
	
	public Vector<Person> peopleWithoutPet(){
		Vector<Person> peopleWithoutPet = new Vector<>();
		for(Person p : people) {
			if(!p.hasPet()) {
				peopleWithoutPet.add(p);
			}
		}
		return peopleWithoutPet;
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		
		for(Person p : people) {
			result.append(p.toString()).append("\n");
		}
		
		return result.toString();
	}
	
}
