package collections_app2;

import java.util.ArrayList;

public class M3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		list.add("test");
		list.add("java");
		list.add("dsa");
		list.add("btm");
		list.add("hi");
		System.out.println(list);
		//list.removeRange(2, 4);// removeRange is a protected method in the arraylist we can't directly used in other classes/packages
		System.out.println(list);
	}
}
