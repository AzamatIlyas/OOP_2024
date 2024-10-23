package Task1A;

public class Runner {

	public static void main(String[] args) {
		
		Cylinder cylinder = new Cylinder(5,10);
		
		Sphere sphere = new Sphere(5);
		
		Cube cube = new Cube(5);
		
		System.out.println("Cylinder volume = "+cylinder.volume());
		System.out.println("Sphere volume = "+sphere.volume());
		System.out.println("Cube volume = "+cube.volume());
		
		System.out.println("Cylinder surface area = "+cylinder.surfaceArea());
		System.out.println("Sphere surface area = "+sphere.surfaceArea());
		System.out.println("Cube surface area = "+cube.surfaceArea());

	}

}
