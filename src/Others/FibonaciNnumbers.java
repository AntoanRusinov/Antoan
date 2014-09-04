package Others;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonaciNnumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = scan.nextInt();

		if (number <= 0) {
			throw new InputMismatchException("The number must be greater than one!");
		}

		System.out.println(fibonaci(number));

	}

	public static String fibonaci(int number) {

		StringBuilder sb = new StringBuilder("1 1");

		long sum = 2;
		long previous = 1;
		long current = 1;
		long next = current + previous;
		long counter = 2;

		if (number > 2) {
			sb.append(" ");
			sb.append(next);
			counter++;
			sum += 2;
		}

		while (counter != number) {

			previous = current;
			current = next;
			next = previous + current;

			sb.append(" ");
			sb.append(next);
			sum += next;
			counter++;

		}
		
		System.out.println("SUM: " + sum);
		String result = sb.toString();
		return result;

	}

}
