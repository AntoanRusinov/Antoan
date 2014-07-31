package Arrays;

public class IterateMatrixLikeASnake {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3, 4 }, // row 0 values
				{ 5, 6, 7, 8 }, { 6, 5, 4, 3 }, { 12, 15, 17, 20 } };

		for (int row = 0; row < matrix.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < matrix[0].length; col++) {
					System.out.printf("%d ", matrix[row][col]);
				}
			} else {
				for (int col = matrix[0].length - 1; col >= 0; col--) {
					System.out.printf("%d ", matrix[row][col]);
				}
			}
			System.out.println();
		}
	}

}
