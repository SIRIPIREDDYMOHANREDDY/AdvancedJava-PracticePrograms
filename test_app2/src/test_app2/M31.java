package test_app2;

import java.util.HashSet;
import java.util.TreeSet;

public class M31 {
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
		HashSet<A> set1 = new HashSet<A>();
		set1.add(new A(110, 201));
		set1.add(new A(140, 241));
		set1.add(new A(1140, 20));
		set1.add(new A(11, 2401));
		set1.add(new A(0, 2014));
		set1.add(new A(4110, 21));
		set1.add(new A(410, 201));
		
		TreeSet<A> set2 = new TreeSet<A>((o1, o2) -> o1.i - o2.i);
		set2.addAll(set1);
		
		TreeSet<A> set3 = new TreeSet<A>((o1, o2) -> o1.j - o2.j);
		set3.addAll(set1);
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}
