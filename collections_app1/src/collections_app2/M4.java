package collections_app2;

import java.util.ArrayList;

public class M4 extends ArrayList{
	public static void main(String[] args) {
		M4 list = new M4();
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		list.add("test");
		list.add("java");
		list.add("dsa");
		list.add("btm");
		list.add("hi");
		System.out.println(list);
		list.removeRange(2, 4);
		System.out.println(list);
	}
}
