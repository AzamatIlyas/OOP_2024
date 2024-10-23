package Task2;

public class StarTriangle {
	
	private int a;
	
	public StarTriangle(int a) {
		this.a = a;
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				if(i >= j) {
					result.append("[*]");
				}
			}
			result.append("\n");
		}
		return result.toString();
	}
	
	
	
}
