package collections_app1;

import java.util.ArrayList;

public class M12 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		
		ArrayList list2 = new ArrayList();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(130);
		list2.add(230);
		list2.add(330);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("------------");
		list1.retainAll(list2);// by using retainAll method we can retain same elements in both list.
		System.out.println(list1);
		System.out.println(list2);
	}
}
