package Strings;

public class ExtractLargestNumber {

	public static void main(String[] args) {

		String text = "Dj  	859351,.’gdsponuh--52378jfsknf /!@#$%^&*"
				+ "()_+][';/.,*-+123!%@%&" + "(*&^%)(^$*(*&^%00532fs";
		String[] testArr = text.split("[^0-9]");
		int newArray[] = new int[testArr.length];

		// parse testArr[] to int type
		for (int i = 0; i < testArr.length; i++) {
			try {
				newArray[i] = Integer.parseInt(testArr[i]);
			} catch (NumberFormatException nfe) {
			}
		}

		// finding largest int in the array
		int max = newArray[0];
		for (int i = 1; i < newArray.length; i++) {
			if (newArray[i] > max)
				max = newArray[i];
		}
		System.out.println("Max is " + max);

	}

}
