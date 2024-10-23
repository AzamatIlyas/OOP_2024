package problem5;

public class Tester {

	public static void main(String[] args) {
		DragonLunch dragonLaunch = new DragonLunch();

        dragonLaunch.kidnap(new Person("Aza",Gender.BOY));   
        dragonLaunch.kidnap(new Person("Beka",Gender.GIRL)); 
        dragonLaunch.kidnap(new Person("Cole",Gender.BOY));   
//        dragonLaunch.kidnap(new Person("Daryn",Gender.BOY));   
        dragonLaunch.kidnap(new Person("Era",Gender.GIRL)); 

        System.out.println("List of kidnapped people:");
        dragonLaunch.allPerson();

        if (dragonLaunch.willDragonEatOrNot()) {
            System.out.println("Dragon have launch!");
        } else {
            System.out.println("Dragon have not launch.");
        }

	}

}
