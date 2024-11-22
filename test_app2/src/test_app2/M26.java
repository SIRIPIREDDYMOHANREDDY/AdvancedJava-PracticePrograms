package test_app2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class M26 {
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
		PriorityQueue<A> queue1 = new PriorityQueue<A>(new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {
				return o1.i- o2.i;
			}
		});
		
		queue1.add(new A(990, 920));
		queue1.add(new A(910, 120));
		queue1.add(new A(901, 201));
		queue1.add(new A(190, 320));
		queue1.add(new A(930, 203));
		queue1.add(new A(390, 340));
		System.out.println(queue1);
		PriorityQueue<A> queue2 = new PriorityQueue<A>(new Comparator<A>() {
			@Override
			public int compare(A o1, A o2) {
				return o1.j- o2.j;
			}
		});
		
		queue2.add(new A(990, 920));
		queue2.add(new A(910, 120));
		queue2.add(new A(901, 201));
		queue2.add(new A(190, 320));
		queue2.add(new A(930, 203));
		queue2.add(new A(390, 340));
		System.out.println(queue2);
	}
}
