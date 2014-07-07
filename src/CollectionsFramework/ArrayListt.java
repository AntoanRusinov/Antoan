package CollectionsFramework;

import java.util.ArrayList;

public class ArrayListt {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		numbers.add(999);

		System.out.println(numbers.get(2));

		System.out.println("Iteration 1#: ");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		System.out.println("Iteration 2#: ");
		for (Integer value : numbers) {
			System.out.println(value);
		}

		System.out.println("Iteration 3#: ");
		numbers.remove(0);

		for (Integer value : numbers) {
			System.out.println(value);
		}

	}

}
