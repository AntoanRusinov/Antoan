package CollectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList linkList = new LinkedList();
		linkList.add("2");
		linkList.add("3");
		linkList.add("4");
		linkList.add("5");
		linkList.addFirst("1");
		linkList.addLast(6);

		System.out.println(linkList);

	}
}