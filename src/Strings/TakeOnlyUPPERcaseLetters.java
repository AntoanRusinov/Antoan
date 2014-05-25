package Strings;

public class TakeOnlyUPPERcaseLetters {

	public static void main(String[] args) {

		String text = "fknskd @#fsmofiNFIJA pslfmdnJ paohOI;JPO jpjog/ ASFMa";
		String fixed = extractCapitals(text);
		System.out.println(fixed);

	}

	public static String extractCapitals(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				result.append(ch);
			}
		}
		return result.toString();
	}

}
