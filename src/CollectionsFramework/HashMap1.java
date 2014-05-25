package CollectionsFramework;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {

		// The keys in HashMap are not sorter!!!
		// In TreeMap keys are sorted!!!
		// That is the difference between them!!!

		HashMap<String, Float> map = new HashMap<String, Float>();

		map.put("Vladi", 6f);
		map.put("Tony", 5f);
		map.put("Stefan", 1f);

		Float toniMarks = map.get("Tony");
		System.out.printf("Tony's mark: %.2f %n", toniMarks);

		map.remove("Stefan");
		System.out.println("Stefan removed!");

		System.out.printf("Is Stefan in the hash table: %b %n",
				map.containsKey("Stefan"));

		map.put("Tony", 6f);
		System.out.println("Tony's mark changed to excellent!");

		System.out.println("Stydents marks and names: ");
		for (Entry<String, Float> entry : map.entrySet()) {
			System.out
					.printf("%s has %.2f%n", entry.getKey(), entry.getValue());

		}
		System.out.printf("There are %d students. %n", map.size());

		map.clear();
		System.out.println("HashMap cleared!");
		System.out.printf("Is the HashTable empty? %b", map.isEmpty());

	}

}
