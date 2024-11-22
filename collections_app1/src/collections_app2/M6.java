package collections_app2;

import java.util.ArrayList;
import java.util.Collections;

class A {
	int i;
}

public class M6 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 10;
		A a2 = new A();
		a2.i = 10;
		
		ArrayList list = new ArrayList();
		list.add(a1);
		list.add(a2);
		Collections.sort(list);
		System.out.println("done");
	}
}
