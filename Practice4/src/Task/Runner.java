package Task;

public class Runner {

	public static void main(String[] args) {

		Triangle tr = new Triangle(4, Color.RED, 5);
		
		Rectangle rec = new Rectangle(5, Color.BLUE, 5, 5);
		
		Circle circle = new Circle(3, Color.GREEN, 3);
		
		rec.draw();
		
		System.out.print("\n");
		
		tr.draw();
		
		System.out.print("\n");
		
		circle.draw();

	}

}
