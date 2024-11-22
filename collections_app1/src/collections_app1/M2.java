package collections_app1;

import java.util.ArrayList;

public class M2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add(4.5);
		list.add(false);
		list.add('r');
		System.out.println(list);
		list.add(1, 100);// adding or inserting an element - 
		System.out.println(list);
		list.add(3, 300);// adding or inserting an element
		System.out.println(list);
		list.add(2, "xyz");
		System.out.println(list);
	}
}
