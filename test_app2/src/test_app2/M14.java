package test_app2;

import java.util.HashSet;

public class M14 {
	static class A {
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
	}
	public static void main(String[] args) {
		A a1 = new A(90);
		A a2 = new A(90);
		HashSet<A> set = new HashSet<A>();
		System.out.println(set.add(a1));
		System.out.println(set.add(a2));
		System.out.println(a1);
		System.out.println(set);
		System.out.println(set.size());
	}
}
