package Task;

public abstract class Shape {
	
	private int position;
    private Color color;

    public Shape(int position, Color color) {
        this.position = position;
        this.color = color;
    }

    public abstract void draw();

}
