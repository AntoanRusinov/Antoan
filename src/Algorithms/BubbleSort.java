package Algorithms;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = new int[] { 64, 25, 12, 22, 11 };

		for (int i = 1; i < array.length; i++) {
			for (int k = 0; k < array.length - i; k++) {
				if (array[k] > array[k + 1]) {
					int temp = array[k];
					array[k] = array[k + 1];
					array[k + 1] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
