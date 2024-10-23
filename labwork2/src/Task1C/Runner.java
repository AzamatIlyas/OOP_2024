package Task1C;

import java.util.*;

public class Runner {

	public static void main(String[] args) {
		
		Child child1 = new Child("Azamat", 2020);
		Child child2 = new Child("Almas", 2022);
		Child child3 = new Child("Dias", 2019);
		Child child4 = new Child("Almas", 2022);
		
		HashSet<Child> unique = new HashSet<>();
		unique.add(child4);
		unique.add(child3);
		unique.add(child2);
		unique.add(child1);
		
		for(Child uChild : unique) {
			System.out.println("Name: "+uChild.getName()+", year: "+uChild.getYear());
		}
		
		
		Child[] group0 = {child1, child2 };
		Child[] group1 = {child3, child4};
		
		Child[][] children = {group0, group1};
		
		
		boolean ok = false;
		Child childForFind = new Child("Dias", 2019);
		
		ChildrenGardenWithGroup childrenGardenWithGroup = new ChildrenGardenWithGroup(children);
		
		for(Child child : childrenGardenWithGroup.getChildren()[childForFind.hashCode()]) {
			if(child.equals(childForFind)) {
				ok = true;
			}
		}
		
		System.out.println(ok);
//		
	}

}
