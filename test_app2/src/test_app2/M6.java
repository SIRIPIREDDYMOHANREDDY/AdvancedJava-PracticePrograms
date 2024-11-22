package test_app2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class M6 {
	static class A {
		int i, j;
		A(int i, int j) {
			this.i = i;
			this.j = j;
		}
		@Override
		public String toString() {
			return "( i = " + i + ", j = " + j + ")";
		}
	}
	
	static class Sort1 implements Comparator<A> {
		@Override
		public int compare(A o1, A o2) {
			return o1.i - o2.i;
		}
	}
	static class Sort2 implements Comparator<A> {
		@Override
		public int compare(A o1, A o2) {
			return o1.j - o2.j;
		}
	}
	
	public static void main(String[] args) {
		A a1 = new A(10, 205);
		A a2 = new A(610, 420);
		A a3 = new A(106, 204);
		A a4 = new A(160, 240);
		A a5 = new A(107, 201);
		A a6 = new A(170, 120);
		A a7 = new A(740, 210);
		
		ArrayList<A> list = new ArrayList<A>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		list.add(a7);
		System.out.println(list);
		Collections.sort(list, new Sort1());
		System.out.println(list);
		Collections.sort(list, new Sort2());
		System.out.println(list);
	}
}
