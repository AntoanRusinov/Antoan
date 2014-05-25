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

		// This is VERY slow, if we want to remove an items from the beginning
		// and in the middle, it is very slow
		// We can only remove items from the end!!! If we want to remove from
		// middle and the end we use LinkedList!
		// Check this out in the next tutorial...

		System.out.println("Iteration 3#: ");
		numbers.remove(0);

		for (Integer value : numbers) {
			System.out.println(value);
		}

	}

}