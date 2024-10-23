package Task2;

public class Position {
	
	private char letter;
	private int san;
	
	public Position(int san, char letter) {
		this.san = san;
		this.letter = letter;
	}
	
	public char getLetter() {
		return letter;
	}
	
	public int getSan() {
		return san;
	}
}
