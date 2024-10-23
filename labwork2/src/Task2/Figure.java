package Task2;

public abstract class Figure {
	
	private Position a;
	
	public Figure(Position a) {
		this.a = a;
	}
	
	public abstract boolean isLegalMove(Position b);
	
	public Position getPos() {
		return a;
	}
	
	public void setPos(Position a) {
		this.a = a;
	}
	
	
}
