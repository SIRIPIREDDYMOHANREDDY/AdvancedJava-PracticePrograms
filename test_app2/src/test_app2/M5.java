package test_app2;

import java.util.ArrayList;
import java.util.Collections;

public class M5 {
	static class A implements Comparable<A> {
		int i;
		int j;
		A(int i, int j) {
			this.i = i;
			this.j = j;
		}
		@Override
		public String toString() {
			return "(i =" + i + ", j = " + j + ")";
		}
		
		public int compareTo(A o) {
		//  return i - o.i;
			return j - o.j;
		}
	}
	public static void main(String[] args) {
		A a1 = new A(10, 0);
		A a2 = new A(0, 20);
		A a3 = new A(30, 30);
		A a4 = new A(20, 40);
		A a5 = new A(5, 10);
		
		ArrayList<A> list = new ArrayList<A>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
// here compare to method implements based on i value
// comparable interface is only for one attribute
// comparable interface not suitable for multiple attributes