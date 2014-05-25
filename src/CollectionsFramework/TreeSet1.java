package CollectionsFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

		String [] bandNames = new String [] { /*some elements here */ };
		
		// TreeSet generate the alphabetical order!!!
		Set<String> uniqueBands = new TreeSet<String>();
		for (String bandName : uniqueBands) {
			System.out.println(bandName);
		}
		
	}

}
