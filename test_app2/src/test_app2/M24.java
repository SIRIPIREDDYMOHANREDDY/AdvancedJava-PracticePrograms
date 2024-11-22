package test_app2;

import java.util.Comparator;
import java.util.TreeMap;

public class M24 {
	static class A {
		int i, j, k;
		A(int i, int j, int k){
			this.i = i;
			this.j = j;
			this.k = k;
		}
		@Override
		public String toString() {
			return "(i = " + i + ", j = " + j + ", k = " + k + ")";
		}
		
		@Override
		public int hashCode() {
			return Integer.toString(i).hashCode() + Integer.toString(j).hashCode() + Integer.toString(k).hashCode();
		}
		
		@Override
		public boolean equals(Object obj) {
			return (obj instanceof A) && (i == ((A) obj).i) && (j == ((A) obj).j) && (k == ((A) obj).k);
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
	static class Sort3 implements Comparator<A> {
		@Override
		public int compare(A o1, A o2) {
			return o1.k - o2.k;
		}
	}
		
	public static void main(String[] args) {
		A a1 = new A(10, 20, 30);
		A a2 = new A(210, 10, 300);
		A a3 = new A(470, 520, 470);
		A a4 = new A(101, 210, 130);
		A a5 = new A(110, 201, 310);
		A a6 = new A(111, 320, 230);
		
		TreeMap<A, String> map = new TreeMap<A, String>(new Sort1());
		map.put(a1, "k1");
		map.put(a2, "k2");
		map.put(a3, "k3");
		map.put(a4, "k4");
		map.put(a5, "k5");
		map.put(a6, "k6");
		System.out.println(map);
		
		TreeMap<A, String> map1 = new TreeMap<A, String>(new Sort2());
		map1.put(a1, "k1");
		map1.put(a2, "k2");
		map1.put(a3, "k3");
		map1.put(a4, "k4");
		map1.put(a5, "k5");
		map1.put(a6, "k6");
		System.out.println(map1);
		
		TreeMap<A, String> map2 = new TreeMap<A, String>(new Sort3());
		map2.put(a1, "k1");
		map2.put(a2, "k2");
		map2.put(a3, "k3");
		map2.put(a4, "k4");
		map2.put(a5, "k5");
		map2.put(a6, "k6");
		System.out.println(map2);
	}
}
