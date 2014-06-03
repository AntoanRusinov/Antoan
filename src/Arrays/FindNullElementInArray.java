package Arrays;
public class FindNullElementInArray {

	public static void main(String[] args) {

		int array[] = new int[100];

		// fill the array
		for (int i = 5; i < array.length; i++) {
			if (i == 25) {
				continue;
			}
			array[i] = i;
		}

		// print the array to the console
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// call the method to check for empty indexes
		findNull(array);

	}

	public static void findNull(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.println("null element at index " + i);
			}
		}
	}
}
