package Others;

import java.util.Scanner;

public class FizBuzDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scan.nextInt();

		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("fuzbuz");
		} else if (number % 3 == 0) {
			System.out.println("fiz");
		} else if (number % 5 == 0) {
			System.out.println("buz");
		} else {
			System.out.println(number);
		}

	}

}
