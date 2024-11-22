package test_app2;

import java.util.PriorityQueue;

public class M11 {
	static class A implements Comparable<A>{
		int i;
		int j;
		A(int i, int j) {
			this.i = i;
			this.j = j;
		}
		@Override
		public String toString() {
			return "(i = " + i + ", j = " + j + ")";
		}
		@Override
		public int compareTo(A o) {
		//	return i - o.i;
			return j - o.j;
		}
	}
	public static void main(String[] args) {
		A a1 = new A(90, 9);
		A a2 = new A(190, 10);
		A a3 = new A(910, 20);
		A a4 = new A(901, 30);
		A a5 = new A(201, 500);
		A a6 = new A(20, 400);
		PriorityQueue<A> queue = new PriorityQueue<A>();
		queue.add(a1);
		queue.add(a2);
		queue.add(a3);
		queue.add(a4);
		queue.add(a5);
		queue.add(a6);
		System.out.println(queue);
	}
}
