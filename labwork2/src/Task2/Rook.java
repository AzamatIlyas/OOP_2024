package Task2;

public class Rook extends Figure{
	
	public Rook(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if(super.getPos().getSan() == b.getSan() || super.getPos().getLetter() == b.getLetter()) {
			return true;
		}
		return false;
	}
}

