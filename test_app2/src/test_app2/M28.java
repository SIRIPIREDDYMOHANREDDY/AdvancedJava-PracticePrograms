package test_app2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class M28 {
	static class A {
		int i;
		int j;
		A(int i, int j) {
			this.i = i;
			this.j = j;
		}
		@Override
		public String toString() {
			return "(" + i + ", " + j + ")";
		}
	}
	
	public static void main(String[] args) {
		HashMap<A, String> map1 = new HashMap<A, String>();
		map1.put(new A(901, 450), "k1");
		map1.put(new A(91, 5472), "k2");
		map1.put(new A(1901, 40), "k3");
		map1.put(new A(1, 405), "k4");
		map1.put(new A(901, 4527), "k5");
		map1.put(new A(901, 5247), "k6");
		
		TreeMap<A, String> map2 = new TreeMap<A, String>(new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {
				return o1.i - o2.i;
			}
		});
		map2.putAll(map1);
		
		TreeMap<A, String> map3 = new TreeMap<A, String>(new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {
				return o1.j - o2.j;
			}
		});
		map3.putAll(map1);
		
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);
	}
}
