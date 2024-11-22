package test_app2;

import java.util.HashMap;

public class M18 {
	static class A {
		int i;
		A(int i){
			this.i = i;
		}
		public String toString() {
			return "(i = " + i + ")";
		}
	}
	public static void main(String[] args) {
		A a1 = new A(9);
		A a2 = new A(9);
		A a3 = new A(9);
		A a4 = new A(9);
		A a5 = new A(9);
		HashMap<A, String> map = new HashMap<A, String>();
		System.out.println(map.put(a1, " k1"));
		System.out.println(map.put(a2, " k2"));
		System.out.println(map.put(a3, " k3"));
		System.out.println(map.put(a4, " k4"));
		System.out.println(map.put(a5, " k5"));
		System.out.println(map);
		System.out.println(map.size());
	}
}
