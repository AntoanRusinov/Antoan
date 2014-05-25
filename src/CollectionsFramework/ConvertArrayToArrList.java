package CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrList {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };

		// Convert the array to ArrayList
		ArrayList<Integer> list = new ArrayList<>(arr.length);

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		// Add random integer into ArrayList
		list.add(10);

		System.out.println(list + " This is list");
		// Convert the ArrayList to array
		Integer[] ints = (Integer[]) list.toArray(new Integer[list.size()]);
		System.out.println(Arrays.toString(ints) + " This is ARRAY");

	}

}
