package CollectionsFramework;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push("bat");
		stack.push("cat");
		stack.push("dog");
		System.out.println("stack = " + stack);
		System.out.println();

		System.out.println("Non-destructively enumerate the Stack.");
		Enumeration e = stack.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			System.out.println();
		}
		System.out.println("Pop and print each element.");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("Stack peek...");
		while (!stack.isEmpty()) {
			System.out.println(stack.peek());
		}
		System.out.println("Is stack empty: " + stack.empty());
	}

}
