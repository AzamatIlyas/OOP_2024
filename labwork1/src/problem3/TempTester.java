package problem3;

import java.util.Scanner;

public class TempTester {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		double degrees = input.nextDouble();
				
		char scale = input.next().charAt(0);
				
		Temperature t = new Temperature(degrees,scale);
				
//		t.setBoth('F', 77.5);
				
//		t.setDegrees(16.4);
				
//		t.setScale('C');
//				
//		t.toCelsius();
				
//		t.toFahrenheit();
				
		System.out.println(t.getDegrees()+" "+t.getScale());

	}

}


