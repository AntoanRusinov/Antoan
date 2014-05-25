package Arrays;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class SortArrPerformace {

	public static void main(String[] args) {

		Date date = new Date();
		long start = System.currentTimeMillis();

		int[] arr = new int[1_000_000];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 1_000_000);
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\n");
		}

		long end = System.currentTimeMillis();
		long diff = end - start;
		System.out.println("Elapsed time: " + diff);

	}

}
