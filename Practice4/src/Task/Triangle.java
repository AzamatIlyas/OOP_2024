package Task;

public class Triangle extends Shape {
	
	private int h;
	
	public Triangle(int a, Color color, int h) {
		super(a,color);
		this.h = h;
	}
	
	public void draw() {
		for(int i = 1; i <= h; i++) {
			
			for(int j = i; j < h; j++) {
				System.out.print(" ");
			} 
			
			for(int j = 1; j <= (2*i-1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
