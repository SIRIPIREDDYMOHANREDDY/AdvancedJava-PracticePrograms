package test_app2;

import java.util.TreeSet;

public class M16 {
	static class A implements Comparable<A>{
		int i;
		A(int i) {
			this.i = i;
		}
		public String toString() {
			return "i = " + i;
		}
		@Override
		public int hashCode() {
			return Integer.toString(i).hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			return i == ((A) obj).i;
		}
		@Override
		public int compareTo(A o) {
			return i - o.i;
		}
	}
	public static void main(String[] args) {
		A a1 = new A(90);
		A a2 = new A(80);
		A a3 = new A(40);
		A a4 = new A(10);
		TreeSet<A> set = new TreeSet<A>();
		System.out.println(set.add(a1));
		System.out.println(set.add(a2));
		System.out.println(set.add(a3));
		System.out.println(set.add(a4));
		System.out.println(set);
		System.out.println(set.size());
	}
}
