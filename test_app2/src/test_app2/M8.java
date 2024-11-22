package test_app2;

import java.util.ArrayList;
import java.util.Collections;

public class M8 {
	public static void main(String[] args) {
		B b1 = new B(10, 20, 30, 40);
		B b2 = new B(110, 120, 130, 140);
		B b3 = new B(20, 220, 30, 24);
		B b4 = new B(130, 30, 330, 340);
		B b5 = new B(410, 40, 430, 40);
		B b6 = new B(510, 520, 470, 540);
		B b7 = new B(61, 620, 630, 640);
		
		ArrayList<B> list = new ArrayList<B>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		list.add(b7);
		System.out.println(list);
		Collections.sort(list, new SortedI());
		System.out.println(list);
		Collections.sort(list, new SortedJ());
		System.out.println(list);
		Collections.sort(list, new SortedK());
		System.out.println(list);
		Collections.sort(list, new Sortedl());
		System.out.println(list);
	}
}
