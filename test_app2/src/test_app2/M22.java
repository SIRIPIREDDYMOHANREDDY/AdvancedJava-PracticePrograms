package test_app2;

import java.util.HashMap;
import java.util.TreeMap;

public class M22 {
	static class A implements Comparable<A>{
		int i;
		A(int i){
			this.i = i;
		}
		public String toString() {
			return "(i = " + i + ")";
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
		A a1 = new A(9);
		A a2 = new A(91);
		A a3 = new A(92);
		A a4 = new A(29);
		A a5 = new A(19);
		HashMap<A, String> map = new HashMap<A, String>();
		map.put(a1, "k1");
		map.put(a2, "k2");
		map.put(a3, "k3");
		map.put(a4, "k4");
		map.put(a5, "k5");
		TreeMap<A, String> map1 = new TreeMap<A, String>();
		map1.putAll(map);
		System.out.println(map);
		System.out.println(map1);
	}
}
