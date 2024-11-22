package collections_app1;

import java.util.ArrayList;

public class M3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1000);
		list.add(2.4);
		list.add(true);
		list.add('t');
		list.add(4.6);
		list.add(false);
		System.out.println(list);
		list.add(2, "xyz");
		System.out.println(list);
	}
}