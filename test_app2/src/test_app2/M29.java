package test_app2;

import java.util.ArrayList;
import java.util.Collections;

public class M29 {
	static class A {
		int i;
		int j;
		A(int i, int j) {
			this.i = i;
			this.j = j;
		}
		@Override
		public String toString() {
			return "(" + i + ", " + j + ")";
		}
	}
	
	public static void main(String[] args) {
		ArrayList<A> list = new ArrayList<A>();
		list.add(new A(10, 50));
		list.add(new A(110, 510));
		list.add(new A(101, 501));
		list.add(new A(2120, 250));
		list.add(new A(130, 350));
		list.add(new A(310, 503));
		System.out.println(list);
		Collections.sort(list, (o1, o2) -> o1.i - o2.i);
		System.out.println(list);
		Collections.sort(list, (o1, o2) -> o1.j - o2.j);
		System.out.println(list);
	}
}
