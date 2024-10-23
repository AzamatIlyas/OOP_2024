package first;

public class secondfirst {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Azamat";
		s1.id = "23B030360";
		s1.year_of_study = 2;
		
		s1.call();s1.fall();s1.year();
	}

}
class Student{
	String name;
	String id;
	int year_of_study;
	
	
	void call() {
		System.out.println("My name is "+name);
	}
	void fall() {
		System.out.println("My id is "+id);
	}
	void year() {
		System.out.println(year_of_study+1);
	}
}
