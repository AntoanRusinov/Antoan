package Arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int[] array = new int[] { 88, 7547, 4633, 4434, 435, };

		Arrays.sort(array);

		for(int element : array ){
			System.out.println(element);
		}

	}

}
