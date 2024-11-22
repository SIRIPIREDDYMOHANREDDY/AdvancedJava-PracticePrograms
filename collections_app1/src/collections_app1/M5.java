package collections_app1;

import java.util.ArrayList;

public class M5 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(1000);
		list1.add(2.4);
		list1.add(true);
		list1.add('t');
		list1.add(4.6);
		list1.add(false);
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList();
		list2.add(2000);
		list2.add(2.4);
		list2.add(false);
		list2.add('t');
		list2.add(4.6);
		list2.add(true);
		System.out.println(list2);
		System.out.println("---------------");
		list1.addAll(2, list2);
		System.out.println(list1);
		System.out.println(list2);
	}
}
