package test_app2;

import java.util.PriorityQueue;

public class M9 {
	static class A {
		int i;
		A(int i) {
			this.i = i;
		}
		@Override
		public String toString() {
			return "i = " + i;
		}
	}
	public static void main(String[] args) {
		A a1 = new A(90);
		A a2 = new A(190);
		A a3 = new A(910);
		A a4 = new A(901);
		A a5 = new A(201);
		PriorityQueue<A> queue = new PriorityQueue<A>();
		queue.add(a1);
		queue.add(a2);
		queue.add(a3);
		queue.add(a4);
		queue.add(a5);
		System.out.println(queue);
	}
}
// here elements are class A type not comparable type thats why we get class cast exception
