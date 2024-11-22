package collections_app1;

import java.util.ArrayList;
import java.util.Collections;

public class M15 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(210);
		list1.add(130);
		list1.add(401);
		list1.add(150);
		list1.add(160);
		list1.add(10);
		list1.add(0);
		list1.add(15);
		System.out.println(list1);
		Collections.sort(list1, Collections.reverseOrder());// by using Collections.reverseOrder() method to print elements in descending order
		System.out.println(list1);
	}
}
