package collections_app2;

import java.util.ArrayList;

public class M1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		list.add("test");
		list.add("java");
		System.out.println(list);
		String s1 = list.remove(2);
		System.out.println(s1);
		System.out.println(list);
	}
}
