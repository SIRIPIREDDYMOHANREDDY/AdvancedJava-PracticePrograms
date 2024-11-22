package collections_app1;

import java.util.Stack;

public class M72 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(101);
		stack.push(102);
		stack.push(103);
		stack.push(104);
		stack.push(105);
		System.out.println(stack);
		System.out.println(stack.search(105));
		System.out.println(stack.search(104));
		System.out.println(stack.search(103));
		System.out.println(stack.search(102));
		System.out.println(stack.search(101));
		System.out.println(stack.search(100));
	}
}
/*
  Stack is Last In First Out [LIFO]
  Stack counting from top to bottom. Counting starts with '1'.
 */
 