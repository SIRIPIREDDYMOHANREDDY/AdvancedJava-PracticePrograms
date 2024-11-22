package test_app2;

import java.util.Comparator;
import java.util.TreeSet;

public class M17 {
	static class A {
		int i;
		int j;
		A(int i, int j) {
			this.i = i;
			this.j = j;
		}
		public String toString() {
			return "(i = " + i + ", j = " + j + ")";
		}
		@Override
		public int hashCode() {
			return Integer.toString(i).hashCode() + Integer.toString(j).hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			return (obj instanceof A) && (i == ((A) obj).i) && (j == ((A) obj).j);
		}
	}
	static class P implements Comparator<A> {
		@Override
		public int compare(A o1, A o2) {
			return o1.i - o2.i;
		}
	}
	static class Q implements Comparator<A> {
		@Override
		public int compare(A o1, A o2) {
			return o1.j - o2.j;
		}
	}
	public static void main(String[] args) {
		A a1 = new A(90, 40);
		A a2 = new A(80, 50);
		A a3 = new A(40, 7000);
		A a4 = new A(10, 30);
		TreeSet<A> set = new TreeSet<A>(new P());
		System.out.println(set.add(a1));
		System.out.println(set.add(a2));
		System.out.println(set.add(a3));
		System.out.println(set.add(a4));
		System.out.println(set);
		System.out.println(set.size());
		
		TreeSet<A> set1 = new TreeSet<A>(new Q());
		System.out.println(set1.add(a1));
		System.out.println(set1.add(a2));
		System.out.println(set1.add(a3));
		System.out.println(set1.add(a4));
		System.out.println(set1);
		System.out.println(set1.size());
	}
}
