package Algorithms;

import java.util.Arrays;

public class SelectionSortAlgorithm {

	public static void main(String[] args) {

		int[] array = { 64, 25, 12, 22, 11 };
		
		for (int i = 0; i < array.length; i++) {
			for (int  k = i + 1; k < array.length; k++) {
				if (array[i] > array[k]) // swap items
				{
					int temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));

	}

}
