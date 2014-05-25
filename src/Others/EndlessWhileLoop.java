package Others;

import java.util.Scanner;

public class EndlessWhileLoop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int answer = 44;
		System.out.println("Enter number from 1 to 100: ");

		do {

			int number = scan.nextInt();

			if (number < answer) {
				System.out.println("Enter bigger number:");
				continue;
			}
			if (number > answer) {
				System.out.println("Enter smaller number:");
				continue;
			}
			if (answer == number) {
				System.out.println("You won the game!");
				break;
			}

		} while (true);

	}
}
