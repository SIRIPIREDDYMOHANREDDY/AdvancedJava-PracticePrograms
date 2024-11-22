package collections_app1;

import java.util.Stack;

public class M86 {
	public static void main(String[] args) {
		String s = "({[)}]";
		
		Stack<Character> stack = new Stack<Character>();
		char c1;
		boolean flag = true;
		for(int i = 0; i < s.length(); i++) {
			c1 = s.charAt(i);
			if(c1 == '(' || c1 == '[' || c1 == '{') {
				stack.push(c1);
			}
			else if(stack.size() != 0) {
				char lastChar = stack.pop();
				if((c1 == ')' && lastChar != '(') ||
				   (c1 == ']' && lastChar != '[') ||
				   (c1 == '}' && lastChar != '{')) {
					flag = false;
					break;
				}
			}
			else {
				flag = false;
				break;
			}
		}
		if(!stack.isEmpty()) {
			flag = false;
		}
		System.out.println(flag);
	}
}
