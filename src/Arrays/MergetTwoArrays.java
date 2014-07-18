package Arrays;

import java.util.Arrays;

public class MergetTwoArrays {

	public static void main(String[] args) {

		int[] array1 = { 8, 5, 3, 68 };
		int[] array2 = { 9, 1, 4, 50 };

		int[] result = merge(array1, array2);

		Arrays.sort(result);
		print(result);

	}

	public static int[] merge(int[] array1, int[] array2) {

		int[] result = new int[array1.length + array2.length];
		int position = 0;

		for (int i = 0; i < array1.length; i++) {
			result[position] = array1[i];
			position++;
		}

		for (int i = 0; i < array2.length; i++) {
			result[position] = array2[i];
			position++;
		}

		return result;
	}

	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
