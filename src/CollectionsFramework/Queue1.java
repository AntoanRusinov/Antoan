package CollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	// (head) <= O O O O O O O <= (tail)

	public static void main(String[] args) {
		Queue<Integer> myQ = new LinkedList<Integer>();
		myQ.add(1);
		myQ.add(6);
		myQ.add(3);
		System.out.println(myQ); // 1 6 3

		// peek is just to see without remove from the queue
		int peek = myQ.peek();
		System.out.println(peek);

		// POLL - retrieve and remove the first element
		int first = myQ.poll();
		System.out.println(first);// 1
		System.out.println(myQ);// 6 3
	}

}
