package Strings;

public class ReverseString {

	public static void main(String[] args) {
		String text = "olleH dlroW rehtoM rekcuF ";

		for (String part : text.split(" ")) {
			System.out.print(new StringBuilder(part).reverse().toString());
			System.out.print(" ");

		}
	}
}
