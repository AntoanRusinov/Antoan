package Others;

public class VarArgsParameters {

	public static void main(String args[]) {

		int[] array = { 1, 2, 3, 4, 5 };

		sum(1, 2, 4, 5);
		sum(1, 2);
		sum();

		sumArrays(array);

		display("a", "b", "c", "d");
	}

	public static void sum(int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("The sum is " + sum);
	}

	static int sumArrays(int[]... intArrays) {
		int sum, i, j;

		sum = 0;
		for (i = 0; i < intArrays.length; i++) {
			for (j = 0; j < intArrays[i].length; j++) {
				sum += intArrays[i][j];
			}
		}
		return (sum);
	}

	static void display(String... vals) {
		for (int i = 0; i < vals.length; i++) {
			System.out.println(vals[i]);
		}
	}

}
