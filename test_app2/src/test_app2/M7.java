package test_app2;

import java.util.ArrayList;
import java.util.Collections;

public class M7 {
	public static void main(String[] args) {
		A a1 = new A(10, 420, 530);
		A a2 = new A(110, 240, 350);
		A a3 = new A(101, 204, 305);
		A a4 = new A(102, 204, 306);
		A a5 = new A(102, 203, 360);
		A a6 = new A(120, 230, 630);
		A a7 = new A(103, 230, 370);
		
		ArrayList<A> list = new ArrayList<A>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		list.add(a7);
		System.out.println(list);
		Collections.sort(list, new SortBasedOnI());
		System.out.println(list);
		Collections.sort(list, new SortBasedOnJ());
		System.out.println(list);
		Collections.sort(list, new SortBasedOnK());
		System.out.println(list);
	}
}
