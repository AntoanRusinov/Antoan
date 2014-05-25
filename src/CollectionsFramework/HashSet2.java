package CollectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashSet2 {

	public static void main(String[] args) {

		// HashMap is randomly shows the collection
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		// LinkedHashMap remember the order you added items => like Queue (FIFO)
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		// TreeMap is generating the numeric layout of the key
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		System.out.println("TreeMap");
		testMap(treeMap);
		System.out.println("\nLinkedHashMap");
		testMap(linkedHashMap);
		System.out.println("\nHashMap");
		testMap(hashMap);
	}

	private static void testMap(Map<Integer, String> map) {
		map.put(9, "cat");
		map.put(15, "dog");
		map.put(7, "sheep");
		map.put(157, "rabbit");
		map.put(90, "Falcon");

		for (Integer key : map.keySet()) {
			String value = map.get(key);

			System.out.println(key + " " + value);
		}
	}

}
