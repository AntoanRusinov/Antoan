package Arrays;

public class RemoveLastElement {

	public static void main(String[] args) {

		int[] array = { 10, 20, 100, 30, 40 };

		removeMax(array);
	}

	public static int removeMax(int[] array) {

		int length = array.length - 1;

		int[] fixedArray = new int[length];

		if (array.length == 0) {
			return -1;
		}

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

		for (int i = 0; i < array.length - 1; i++) {
			for (int k = 0; k < fixedArray.length; k++) {
				fixedArray[i] = array[i];
			}
		}
		print(fixedArray);
		return 0;
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
