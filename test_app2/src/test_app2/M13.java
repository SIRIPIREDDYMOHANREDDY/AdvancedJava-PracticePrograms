package test_app2;

import java.util.HashSet;

public class M13 {
	static class A {
		int i;
		A(int i) {
			this.i = i;
		}
		public String toString() {
			return "i = " + i;
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
// even though set wont allow duplicates it store both i values