package test_app2;

import java.util.HashMap;
import java.util.TreeMap;

public class M32 {
	static class A {
		int i;
		int j;
		A(int i, int j){
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
		map1.put(new A(900, 400), "k1");
		map1.put(new A(500, 405), "k2");
		map1.put(new A(600, 460), "k3");
		map1.put(new A(520, 470), "k4");
		map1.put(new A(908, 800), "k5");
		map1.put(new A(980, 800), "k6");
		map1.put(new A(903, 300), "k7");
		
		TreeMap<A, String> map2 = new TreeMap<A, String>((o1, o2) -> o1.i - o2.i);
		map2.putAll(map1);
		
		TreeMap<A, String> map3 = new TreeMap<A, String>((o1, o2) -> o1.j - o2.j);
		map3.putAll(map1);
		
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);
	}
}
