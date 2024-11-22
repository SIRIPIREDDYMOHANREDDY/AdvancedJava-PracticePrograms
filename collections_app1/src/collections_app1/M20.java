package collections_app1;

import java.util.LinkedList;

public class M20 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(100);
		list.add(10);
		list.add(200);
		list.add(30);
		list.add(15);
		System.out.println(list);
		System.out.println(list.pollLast());
		System.out.println(list);
	}
}
