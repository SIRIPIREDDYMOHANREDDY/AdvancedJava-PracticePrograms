package test_app2;

import java.util.Comparator;
import java.util.TreeMap;

public class M23 {
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
			return (obj instanceof A) && (i == ((A) obj).i) && (j == ((A) obj).j);
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
		A a1 = new A(10, 409);
		A a2 = new A(102, 940);
		A a3 = new A(120, 407);
		A a4 = new A(210, 640);
		A a5 = new A(103, 460);
		A a6 = new A(310, 400);
		A a7 = new A(130, 450);
		A a8 = new A(104, 540);
		
		TreeMap<A, String> map = new TreeMap<A, String>(new Sort1());
		map.put(a1, "k1");
		map.put(a2, "k2");
		map.put(a3, "k3");
		map.put(a4, "k4");
		map.put(a5, "k5");
		map.put(a6, "k6");
		map.put(a7, "k7");
		map.put(a8, "k8");
		System.out.println(map);
		
		TreeMap<A, String> map1 = new TreeMap<A, String>(new Sort2());
		map1.put(a1, "k1");
		map1.put(a2, "k2");
		map1.put(a3, "k3");
		map1.put(a4, "k4");
		map1.put(a5, "k5");
		map1.put(a6, "k6");
		map1.put(a7, "k7");
		map1.put(a8, "k8");
		System.out.println(map1);
		
	}
}
