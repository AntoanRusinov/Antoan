package Strings;

public class WordCounter {

	public static void main(String[] args) {

		String text = "we want to cancel this course because java is not the most"
				+ " popular language to and the final java course  is justs creepy! "
				+ "this is JAVA test. We want to compile over and over  again without   "
				+ " errors and to practice ourselves! Hava a nice day! :)";

		int counter = 0;
		int index = text.indexOf("is");
		while (index != -1) {
			System.out.println("is found on index: " + index);
			index = text.indexOf("is", index + 1);
			counter++;
		}
		System.out.println("The word \"is\" in the text: " + counter
				+ " times!");

	}
}