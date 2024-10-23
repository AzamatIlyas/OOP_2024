package problem3;

public class Temperature {
	public double value;
	public char character;
	
	public Temperature(){
		this.value = 0.0;
		this.character = 'C';
	}
	
	public Temperature(double degrees) {
		this.value = degrees;
		this.character = 'C';
	}
	
	public Temperature(char scale) {
		this.value = 0.0;
		if(scale == 'C' || scale == 'F') {
			this.character = scale;
		}else {
			throw new IllegalArgumentException("Wrong scale. Input only 'C' or 'F'!");
		}
	}
	
	public Temperature(double degrees , char scale) {
		this.value = degrees;
		if(scale == 'C' || scale == 'F') {
			this.character = scale;
		}else {
			throw new IllegalArgumentException("Wrong scale. Input only 'C' or 'F'!");
		}
	}
	
	public void toFahrenheit() {
		if(character == 'C') {
			this.value = (9*(value/5) + 32);
			this.character = 'F';
		}else {
			System.out.println("It's already in this condition");
		}
	}
	
	public void toCelsius() {
		if(character == 'F') {
			this.value = 5*(value - 32)/9;
			this.character = 'C';
		}else {
			System.out.println("It's already in this condition");
		}
		
	}
	
	public void setScale(char scale) {
		if(scale == 'C' || scale == 'F') {
			this.character = scale;
		}else {
			throw new IllegalArgumentException("Wrong scale. Input only 'C' or 'F'!");
		}
	}
	
	public void setDegrees(double degrees) {
		this.value = degrees;
	}
	
	public void setBoth(char scale, double degrees) {
		this.value = degrees;
		if(scale == 'C' || scale == 'F') {
			this.character = scale;
		}else {
			throw new IllegalArgumentException("Wrong scale. Input only 'C' or 'F'!");
		}
	}
	
	public char getScale() {
		return character;
	}
	
	public double getDegrees() {
		return value;
	}
}
