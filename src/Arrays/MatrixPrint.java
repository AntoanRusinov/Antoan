package Arrays;

import java.util.Scanner;

public class MatrixPrint {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number less than 5: ");
		int enter = input.nextInt();
		for (int row = 0; row <= enter - 1; row++) {
			int counter = row + 1;
			for (int col = 0; col < enter; col++) {
				sb.append(counter + " ");
				counter++;
			}
			sb.append("\n");
		}
		System.out.println(sb);
		System.out.println("DONE");
	}
}
