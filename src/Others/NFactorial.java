package Others;

import java.util.Scanner;

public class NFactorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("enter number: ");
		long number = scan.nextInt();
		long factorial = 1;

		do {
			factorial *= number;
			number--;
		} while (number > 0);
		System.out.println("factorial is: " + factorial);
	}
}
