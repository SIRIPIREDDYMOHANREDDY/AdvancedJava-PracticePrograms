package test_app2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class M27 {
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
		HashSet<A> set1 = new HashSet<A>();
		set1.add(new A(90, 30));
		set1.add(new A(901, 130));
		set1.add(new A(910, 310));
		set1.add(new A(909, 930));
		set1.add(new A(901, 309));
		set1.add(new A(990, 390));
		set1.add(new A(190, 930));
		
		TreeSet<A> set2 = new TreeSet<A>(new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {
				return o1.i - o2.i;
			}
		});
		set2.addAll(set1);
		
		TreeSet<A> set3 = new TreeSet<A>(new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {
				return o1.j - o2.j;
			}
		});
		set3.addAll(set1);
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}
