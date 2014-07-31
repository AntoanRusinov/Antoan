package Others;

public class WildcardOperator {

	public static void main(String[] args) {

		int a = 5;
		int b = 0;
		int max;

		// this is the typical way...
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("Traditional way: " + max);

		// and this is the tricky one...
		max = (a > b) ? a : b;
		System.out.println("Tricky way: " + max);
	}

}
