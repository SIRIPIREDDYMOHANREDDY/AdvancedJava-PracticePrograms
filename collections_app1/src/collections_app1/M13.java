package collections_app1;

import java.util.ArrayList;

public class M13 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		System.out.println(list1);
		System.out.println(list1.contains(30));// by using contains method we can search specified element present in the list or not
		System.out.println(list1.contains(130));
	}
}
