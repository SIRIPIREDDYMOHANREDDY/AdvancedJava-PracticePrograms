package collections_app2;

import java.util.ArrayList;
import java.util.Collections;

public class M5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(12);
		list.add(1);
		list.add(112);
		list.add(212.0);// it gives exception because while using sorting method all elements are same data type
		list.add(122);
		list.add(100);
		list.add(0);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
/*
 Conditions for achieving sorting
    1. All elements should be same data type
    2. No null elements
    3. all elements should be either comparable or comparator type
 */