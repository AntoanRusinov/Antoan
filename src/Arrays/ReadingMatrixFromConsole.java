package Arrays;

import java.util.Scanner;

public class ReadingMatrixFromConsole {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of rows:");
		int rowNums = input.nextInt();

		System.out.println("Enter number of cols:");
		int colNums = input.nextInt();

		int[][] array = new int[rowNums][colNums];

		for (int row = 0; row < rowNums; row++) {
			for (int col = 0; col < colNums; col++) {
				System.out.println("Enter number: ");
				int temp = input.nextInt();
				array[row][col] = temp;
			}
		}

		for (int row = 0; row < rowNums; row++) {
			for (int col = 0; col < colNums; col++) {
				System.out.printf("%d ", array[row][col]);
			}
			System.out.println();
		}
	}
}
