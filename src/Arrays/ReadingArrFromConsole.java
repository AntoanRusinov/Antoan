package Arrays;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class ReadingArrFromConsole {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter how much elements you want to add: ");

		int n = input.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			System.out.printf("Enter element %d: ", i + 1);
			array[i] = input.nextInt();
		}
		System.out.println(java.util.Arrays.toString(array));

	}
}
