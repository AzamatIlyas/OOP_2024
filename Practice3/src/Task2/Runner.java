package Task2;

import java.util.*;

public class Runner {

	public static void main(String[] args) {
		Vector<Person> vec = new Vector<>();
		
		Student s1 = new Student("Azamat","tole bi 59","Informational systems", 2, 5000);
		vec.add(s1);
		System.out.println(s1.toString());
		
		Staff e1 = new Staff("Cristiano", "Portugal", "NIS", 4000);
		vec.add(e1);
		System.out.println(e1.toString());

	}

}
