package Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {

		int[] array1 = { 8, 5, 3, 100 };
		int[] array2 = { 9, 1, 4 };

		int[] result = merge(array1, array2);

		sort(result);
		removeMax(result);

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

	public static void removeMax(int[] array) {

		int length = array.length - 1;

		int[] fixedArray = new int[length];

		if (array.length <= 0) {
			throw new ArrayIndexOutOfBoundsException("Array is empty!");
		}

		sort(array);

		for (int i = 0; i < array.length - 1; i++) {
			for (int k = 0; k < fixedArray.length; k++) {
				fixedArray[i] = array[i];
			}
		}

		print(fixedArray);

	}

	public static void sort(int[] array) {
		// Arrays.sort(array);

		for (int e = 0; e < array.length; e++) {
			for (int y = e + 1; y < array.length; y++) {
				if (array[e] > array[y]) {

					int temp = array[e];
					array[e] = array[y];
					array[y] = temp;
				}
			}
		}
	}

	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
