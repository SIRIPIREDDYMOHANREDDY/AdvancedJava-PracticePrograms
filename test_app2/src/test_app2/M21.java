package test_app2;

import java.util.HashMap;
import java.util.TreeMap;

public class M21 {
	static class A {
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
	}
	public static void main(String[] args) {
		A a1 = new A(9);
		A a2 = new A(9);
		A a3 = new A(9);
		A a4 = new A(9);
		A a5 = new A(9);
		HashMap<A, String> map = new HashMap<A, String>();
		map.put(a1, "k1");
		map.put(a2, "k2");
		map.put(a3, "k3");
		map.put(a4, "k4");
		map.put(a5, "k5");
		TreeMap<A, String> map1 = new TreeMap<A, String>();
		map1.putAll(map);
	}
}
// keys should be comparable type otherwise we supply comparator because of this sort is not happened.