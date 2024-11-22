package test_app2;

import java.util.PriorityQueue;

public class M10 {
	static class A implements Comparable<A>{
		int i;
		A(int i) {
			this.i = i;
		}
		@Override
		public String toString() {
			return "i = " + i;
		}
		@Override
		public int compareTo(A o) {
			return i - o.i;
		}
	}
	public static void main(String[] args) {
		A a1 = new A(90);
		A a2 = new A(190);
		A a3 = new A(910);
		A a4 = new A(901);
		A a5 = new A(201);
		A a6 = new A(20);
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
// in case of priority queue comparable is required
// in priority queue head element is sorted