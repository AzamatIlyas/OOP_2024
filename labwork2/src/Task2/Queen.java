package Task2;

public class Queen extends Figure {
	
	public Queen(Position a) {
		super(a);
	}
	
	public boolean isLegalMove(Position b) {
		if((Math.abs(super.getPos().getSan() - b.getSan()) == Math.abs(super.getPos().getLetter() - b.getLetter())) || 
				(super.getPos().getSan() == b.getSan() || super.getPos().getLetter() == b.getLetter())) {
			return true;
		}
		return false;
	}
	
	
}
