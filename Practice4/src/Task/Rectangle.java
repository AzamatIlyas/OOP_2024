package Task;

public class Rectangle extends Shape {
	
	private int a;
	private int b;
	
	public Rectangle(int position, Color color, int a, int b) {
		super(position, color);
		this.a = a;
		this.b = b;
	}
	
	public void draw() {
		
		for(int i = 0; i < a; i++) {
			
			for(int j = 0; j < b; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
