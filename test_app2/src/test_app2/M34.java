package test_app2;

import java.util.HashSet;

public class M34 {
	static class A {
		int i, j ,k;
		A(int i, int j, int k) {
			this.i = i;
			this.j = j;
			this.k = k;
		}
		@Override
		public String toString() {
			return "(" + i + ", " + j + ", " + k + ")";
		}
		
		@Override
		public int hashCode() {
			int hash = Integer.toString(i).hashCode();
				hash += Integer.toString(j).hashCode();
				hash += Integer.toString(k).hashCode();
			System.out.println("hashCode for " + this + ":" + hash);
			return hash;
		}
		
		@Override
		public boolean equals(Object obj) {
			boolean flag = (obj instanceof A) && (i == ((A) obj).i) && (j == ((A) obj).j) && (k == ((A) obj).k);
			System.out.println("equals between " + this + " and " + obj + ":" + flag);
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
		
		System.out.println(a1 + " (a1) adding status: " + set.add(a1));
		System.out.println("all set elements:" + set);
		System.out.println("-----------------------------");
		
		System.out.println(a2 + " (a2) adding status: " + set.add(a2));
		System.out.println("all set elements:" + set);
		System.out.println("-----------------------------");
		
		System.out.println(a3 + " (a3) adding status: " + set.add(a3));
		System.out.println("all set elements:" + set);
		System.out.println("-----------------------------");
		
		System.out.println(a4 + " (a4) adding status: " + set.add(a4));
		System.out.println("all set elements:" + set);
		System.out.println("-----------------------------");
		
		System.out.println(a5 + " (a5) adding status: " + set.add(a5));
		System.out.println("all set elements:" + set);
		System.out.println("-----------------------------");
		
		System.out.println(a6 + " (a6) adding status: " + set.add(a6));
		System.out.println("all set elements:" + set);
		System.out.println("-----------------------------");
		
		System.out.println(a7 + " (a7) adding status: " + set.add(a7));
		System.out.println("all set elements:" + set);
		System.out.println("-----------------------------");
		
		System.out.println(a8 + " (a8) adding status: " + set.add(a8));
		System.out.println("all set elements:" + set);
		System.out.println("-----------------------------");
		
		System.out.println(a9 + " (a9) adding status: " + set.add(a9));
		System.out.println("all set elements:" + set);
		System.out.println("-----------------------------");
		
		System.out.println(a10 + " (a10) adding status: " + set.add(a10));
		System.out.println("all set elements:" + set);
		System.out.println("-----------------------------");
		
		System.out.println(a11 + " (a11) adding status: " + set.add(a11));
		System.out.println("all set elements:" + set);
		System.out.println("-----------------------------");
		
		System.out.println(a12 + " (a12) adding status: " + set.add(a12));
		System.out.println("all set elements:" + set);
		System.out.println("-----------------------------");
	
		System.out.println(set);
	}
}
// inside hash set, elements are stored in linked list. and is called hash bucketing method
// if same element is occur again it check with all elements stored in that particular bucket  