package first;
import java.util.Scanner;

public class pol {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		int i = 0;
		int a = name.length() - 1;
		boolean ok = true;
		while(a >= i) {
			if(name.charAt(i) != name.charAt(a)) {
				ok = false;
				break;
			}
			i = i+1;
			a = a-1;
		}
		if (ok){
			System.out.print("Polindrom");
		}else {
			System.out.print("Polindrom emes");
		}

	}

}
