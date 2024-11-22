package collections_app1;

import java.util.PriorityQueue;
// PriorityQueue gives priority based on quantity
// By default PriorityQueue give priority form lower  to higher
public class M22 {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		queue.add(100);
		queue.add(120);
		queue.add(10);
		queue.add(140);
		queue.add(90);
		queue.add(11);
		System.out.println(queue);
		System.out.println(queue.peek());// reading head element
		System.out.println(queue);
	}
}
