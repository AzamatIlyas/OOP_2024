package Task2;

public class Runner {

	public static void main(String[] args) {
		
		Position a = new Position(2,'D');
		
		Position b = new Position(4,'C');
		
		Rook rook = new Rook(a);
		
		Pawn pawn = new Pawn(a);
		
		Bishop bishop = new Bishop(a);
		
		Queen queen = new Queen(a);
		
		King king = new King(a);
		
		Knight knight = new Knight(a);
		
		System.out.println(knight.isLegalMove(b));
		
		

	}

}
