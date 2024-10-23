package problem1;

public class Data {
	private double max = 0;
	private double sum = 0;
	private int count = 0;
	
	public void add(double value) {
		sum += value;
		count++;
		if(value > max) {
			max = value;
		}
	}
	
	public double average() {
		if(count == 0) {
			return 0;
		}
		return sum/count;
	}
	
	public double largestNum() {
		return max;
	}
		
}
	
	
	
	
	


