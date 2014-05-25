package Arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("This is normal array:");
		System.out.println(Arrays.toString(array));

		int[] reversed = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			reversed[array.length - i - 1] = array[i];
		}
		System.out.println("This is reversed array:");
		System.out.println(Arrays.toString(reversed));

	}
}