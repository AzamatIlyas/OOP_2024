package first;
import java.util.Scanner;

public class square {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int perimetr = a*4;
		int area = a*a;
		double diagonal = Math.sqrt(a*a + a*a);
		System.out.println("Perimetr = " + perimetr);
		System.out.println("Area = " + area);
		System.out.println("Diagonal = " + diagonal);
		input.close();

	}

}
