package first;
import java.util.Scanner;

public class aza {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String myname = input.nextLine();
		System.out.print("+");
		for(int i = 0; i < myname.length();++i) {
			System.out.print("-");
		}
		System.out.print("+\n|"+myname+"|\n+");
		for(int i = 0; i < myname.length();++i) {
			System.out.print("-");
		}
		System.out.print("+");

	}

}
