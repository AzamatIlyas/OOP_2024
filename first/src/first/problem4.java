package first;
import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		double d = b*b - 4*a*c;
		if(d == 0) {
			int first = -b/(2*a);
			System.out.print("D = "+first);
		}else if(d > 0) {
			double first = (-b + Math.sqrt(d))/(2*a);
			double second = (-b - Math.sqrt(d))/(2*a);
			System.out.print("D1 = "+first+"\nD2 = " + second);
		}else {
			System.out.print("D is negative ");
		}
		

	}

}
