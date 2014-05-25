package Strings;

import java.util.Scanner;

public class BiggestWordInString {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		String line;
		String largest;
		String currentWord;
		String wordsLine[];

		System.out.println("Please enter text.");
		line = scan.nextLine();

		line = line.trim();
		if (line.equals("")) {
			System.out.println("You have not entered a any words.");
			return;
		}

		wordsLine = line.split(" ");
		largest = wordsLine[0];
		for (int i = 1; i < wordsLine.length; i++) {
			currentWord = wordsLine[i];
			if (currentWord.length() > largest.length()) {
				largest = currentWord;
			}
		}
		System.out.println("The largest word is " + largest
				+ " with  a length of " + largest.length());

	}
}
