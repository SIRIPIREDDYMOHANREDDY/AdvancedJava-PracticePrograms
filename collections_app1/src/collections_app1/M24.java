package collections_app1;

import java.util.PriorityQueue;

public class M24 {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(100);
		queue.add(120);
		queue.add(10);
		queue.add(140);
		queue.add(90);
		queue.add(11);
		System.out.println(queue);
		System.out.println(queue.poll());// poll method removing head element
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
