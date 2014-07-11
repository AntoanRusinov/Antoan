package Arrays;

public class PrintAndSumElements {
	public static void main(String[] args) {
		double[] array = { 1.9, 2.9, 3.4, 3.5 };

		// Print all the array elements
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		// Summing all elements
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		System.out.println("Total is " + total);
		
		// Finding the largest element
		double max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		System.out.println("Max is " + max);

		// Print arr with foreach loop
		System.out.println("\nIterating with foreach loop:");
		for (double element : array) {
			System.out.println(element);
		}
	}
}
