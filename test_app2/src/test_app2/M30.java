package test_app2;

import java.util.PriorityQueue;

public class M30 {
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
		PriorityQueue<A> queue1 = new PriorityQueue<A>((o1, o2) -> o1.i - o2.i);
		queue1.add(new A(410, 901));
		queue1.add(new A(40, 91));
		queue1.add(new A(1000, 1));
		queue1.add(new A(10, 90));
		queue1.add(new A(4910, 9301));
		queue1.add(new A(4910, 9041));
		System.out.println(queue1);
		
		PriorityQueue<A> queue2 = new PriorityQueue<A>((o1, o2) -> o1.j - o2.j);
		queue2.add(new A(410, 901));
		queue2.add(new A(40, 91));
		queue2.add(new A(1000, 1));
		queue2.add(new A(10, 90));
		queue2.add(new A(4910, 9301));
		queue2.add(new A(4910, 9041));
		System.out.println(queue2);
	}
}
