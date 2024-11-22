package collections_app2;

import java.util.ArrayList;

public class M2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		list.add("test");
		list.add("java");
		System.out.println(list);
		boolean b1 = list.remove("hello");
		System.out.println(b1);
		System.out.println(list);
		boolean b2 = list.remove("dsa");
		System.out.println(b2);
		System.out.println(list);
	}
}
