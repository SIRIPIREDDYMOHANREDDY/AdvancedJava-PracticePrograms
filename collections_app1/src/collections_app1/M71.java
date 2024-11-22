package collections_app1;

import java.util.Stack;

public class M71 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(101);
		stack.push(102);
		stack.push(103);
		stack.push(104);
		stack.push(105);
		System.out.println(stack);
		System.out.println(stack.pop());// pop method for read and removing last element
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}
