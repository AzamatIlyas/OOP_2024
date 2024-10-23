package Task2;

import java.util.*;

public class Bishop extends Figure{
	
	public Bishop(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if(Math.abs(super.getPos().getSan() - b.getSan()) == Math.abs(super.getPos().getLetter() - b.getLetter())) {
			return true;
		}
		return false;
	}
	
	
	
	
}
