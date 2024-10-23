package problem1;

import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Data data = new Data();
		
		while(true) {
			System.out.print("Enter number: ");
			String value = input.nextLine();
			if(value.equals("Q")) {
				break;
			}else {
				double san = Double.parseDouble(value);
				data.add(san);
			}
		}
		
		System.out.println("Average = " + data.average());
		System.out.println("Maximum = " + data.largestNum());

	}

}
