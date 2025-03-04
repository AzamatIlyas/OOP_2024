package Task1A;

public class Sphere extends Shape3D{
	
	private double radius;
	
	public Sphere(double r) {
		this.radius = r;
	}
	
	@Override
	public double volume() {
		return 0.75*Math.PI*radius*radius*radius;
	}
	
	@Override
	public double surfaceArea() {
		return 4*Math.PI*radius*radius;
	}
	
}
