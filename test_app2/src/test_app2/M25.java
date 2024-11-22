package test_app2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class M25 {
	static class A {
		int i;
		int j;
		A(int i, int j) {
			this.i = i;
			this.j = j;
		}
		@Override
		public String toString() {
			return "(i = " + i + ", j = " + j + ")";
		}
		
		@Override
		public int hashCode() {
			return Integer.toString(i).hashCode() + Integer.toString(j).hashCode();
		}
		
		@Override
		public boolean equals(Object obj) {
			return (obj instanceof A) && (i == ((A) obj).i) && (j == ((A) obj).i);
		}
	}
	public static void main(String[] args) {
		ArrayList<A> list = new ArrayList<A>();
		list.add(new A(10, 40));
		list.add(new A(110, 240));
		list.add(new A(101, 420));
		list.add(new A(520, 470));
		list.add(new A(501, 402));
		list.add(new A(470, 520));
		list.add(new A(502, 407));
		list.add(new A(110, 140));
		System.out.println(list);
		Collections.sort(list, new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {
				return o1.i - o2.i;
			}
		});
		System.out.println(list);
		Collections.sort(list, new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {
				return o1.j - o2.j;
			}
		});
		System.out.println(list);
	}
}
