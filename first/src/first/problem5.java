package first;
import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int balance = input.nextInt();
		int interest = input.nextInt();
		
		int newbalance = balance + (balance*interest/100);
		System.out.print(newbalance);
			
	}

}
