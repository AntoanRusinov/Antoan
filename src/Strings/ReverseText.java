package Strings;

public class ReverseText {
	public static void main(String[] args) {
		String text = "olleH dlroW rehtoM rekcuF ";
		String reversed = reverseText(text);
		System.out.println(reversed); // tide ME
	}

	public static String reverseText(String text) {
		StringBuilder sb = new StringBuilder();
		for (int i = text.length() - 1; i >= 0; i--)
			sb.append(text.charAt(i));
		return sb.toString();
	}
}
