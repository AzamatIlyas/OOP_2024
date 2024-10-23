package Task1A;

public class Cylinder extends Shape3D {
	
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double volume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	@Override
	public double surfaceArea() {
		return (height * 2 * radius * Math.PI) + (2 * (Math.PI * Math.pow(radius, 2))) ;
	}
}
