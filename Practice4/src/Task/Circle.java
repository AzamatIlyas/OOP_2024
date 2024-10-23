package Task;

public class Circle extends Shape {

	private int radius;
	
	public Circle(int a, Color color, int r) {
		super(a, color);
		this.radius = r;
	}
	
	public void draw() {
		for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (j * j + i * i <= radius * radius) {
                    System.out.print("* "); 
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
	}
}
