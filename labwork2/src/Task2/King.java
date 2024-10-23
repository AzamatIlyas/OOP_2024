package Task2;

public class King extends Figure{
	
	public King(Position a) {
		super(a);
	}
	
	
	public char nextLetter() {
		return (char) (super.getPos().getLetter() + 1);
	}
	
	public char prevLetter() {
		return (char) (super.getPos().getLetter() - 1);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if(b.getSan() > 8 || b.getSan() < 1 || b.getLetter() > 'H' || b.getLetter() < 'A') {
			return false;
		}
		if((super.getPos().getSan() + 1 == b.getSan() && super.getPos().getLetter() == b.getLetter()) || (super.getPos().getSan() + 1 == b.getSan() && super.getPos().getLetter() == b.getLetter())) {
			return true;
		}
		if((super.getPos().getSan() == b.getSan() && nextLetter() == b.getLetter()) || (super.getPos().getSan() == b.getSan() && prevLetter() == b.getLetter())) {
			return true;
		}
		if((super.getPos().getSan() + 1 == b.getSan() && nextLetter() == b.getLetter()) || (super.getPos().getSan() - 1 == b.getSan() && nextLetter() == b.getLetter())) {
			return true;
		}
		if((super.getPos().getSan() + 1 == b.getSan() && prevLetter() == b.getLetter()) || (super.getPos().getSan() - 1 == b.getSan() && prevLetter() == b.getLetter())) {
			return true;
		}
		return false;
	}
}
