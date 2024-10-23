package Task2;

public class Knight extends Figure {
	
	public Knight(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if(b.getSan() < 1 || b.getSan() > 8 || b.getLetter() < 'A' || b.getLetter() > 'H') {
			return false;
		}
		
		int posDif = Math.abs(b.getSan() - super.getPos().getSan());
		int letDif = Math.abs(b.getLetter() - super.getPos().getLetter());
		
		return (posDif == 2 && letDif == 1) || (posDif == 1 && letDif == 2);
	}
}
