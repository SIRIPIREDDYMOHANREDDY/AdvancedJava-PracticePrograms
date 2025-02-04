package app1;

import java.util.HashSet;

public class M1 {
	static class A {
		int i, j, k;

		A(int i, int j, int k) {
			this.i = i;
			this.j = j;
			this.k = k;
		}

		@Override
		public String toString() {
			return "(" + i + "," + j + "," + k + ")";
		}

		@Override
		public int hashCode() {
			int hash = Integer.toString(i).hashCode();
			hash += Integer.toString(j).hashCode();
			hash += Integer.toString(k).hashCode();
			System.out.println("hashcode for " + this + ":" + hash);
			return hash;
		}

		@Override
		public boolean equals(Object obj) {
			boolean flag = (obj instanceof A) && (i == ((A) obj).i) && (j == ((A) obj).j) && (k == ((A) obj).k);
			System.out.println("equals between" + this + "and" + obj + ":" + flag);
			return flag;
		}
	}

	public static void main(String[] args) {
		HashSet<A> set = new HashSet<A>();
		A a1 = new A(10, 20, 30);
		A a2 = new A(10, 20, 30);
		A a3 = new A(20, 10, 30);
		A a4 = new A(20, 10, 30);
		A a5 = new A(10, 30, 20);
		A a6 = new A(10, 30, 20);
		A a7 = new A(40, 20, 30);
		A a8 = new A(40, 20, 30);
		A a9 = new A(60, 40, 30);
		A a10 = new A(60, 40, 30);
		A a11 = new A(40, 60, 30);
		A a12 = new A(40, 60, 30);

		System.out.println(a1 + " (a1) adding status" + set.add(a1));
		System.out.println("all set elements after a1:" + set);
		System.out.println("-------------------------");
		System.out.println(a2 + " (a2) adding status" + set.add(a2));
		System.out.println("all set elements after a2:" + set);
		System.out.println("-------------------------");
		System.out.println(a3 + " (a1) adding status" + set.add(a3));
		System.out.println("all set elements after a3:" + set);
		System.out.println("-------------------------");
		System.out.println(a4 + " (a4) adding status" + set.add(a4));
		System.out.println("all set elements after a4:" + set);
		System.out.println("-------------------------");
		System.out.println(a5 + " (a5) adding status" + set.add(a5));
		System.out.println("all set elements after a5:" + set);
		System.out.println("-------------------------");
		System.out.println(a6 + " (a6) adding status" + set.add(a6));
		System.out.println("all set elements after a6:" + set);
		System.out.println("-------------------------");
		System.out.println(a7 + " (a7) adding status" + set.add(a7));
		System.out.println("all set elements after a7:" + set);
		System.out.println("-------------------------");
		System.out.println(a8 + " (a8) adding status" + set.add(a8));
		System.out.println("all set elements after a8:" + set);
		System.out.println("-------------------------");
		System.out.println(a9 + " (a9) adding status" + set.add(a9));
		System.out.println("all set elements after a9:" + set);
		System.out.println("-------------------------");
		System.out.println(a10 + " (a10) adding status" + set.add(a10));
		System.out.println("all set elements after a10:" + set);
		System.out.println("-------------------------");
		System.out.println(a11 + " (a11) adding status" + set.add(a11));
		System.out.println("all set elements after a11:" + set);
		System.out.println("-------------------------");
		System.out.println(a12 + " (a12) adding status" + set.add(a12));
		System.out.println("all set elements after a12:" + set);
		System.out.println("-------------------------");
		System.out.println(set);
	}
}
