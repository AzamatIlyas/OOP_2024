package Task2;

public class Pawn extends Figure {
	
	public Pawn(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if(super.getPos().getSan() > 8 || super.getPos().getSan() < 1 || super.getPos().getLetter() > 'H' || super.getPos().getLetter() < 'A') {
			return false;
		}
		if(super.getPos().getSan() + 1 == b.getSan()) {
			return true;
		}
		return false;
	}
}
