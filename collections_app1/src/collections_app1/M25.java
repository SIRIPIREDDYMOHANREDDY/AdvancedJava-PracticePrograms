package collections_app1;

import java.util.Collections;
import java.util.PriorityQueue;
// PriorityQueue give priority form higher to lower
public class M25 {
	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue(Collections.reverseOrder());
		queue.add(100);
		queue.add(120);
		queue.add(10);
		queue.add(140);
		queue.add(90);
		queue.add(11);
		System.out.println(queue);
		System.out.println(queue.poll());// poll method read and removing head element
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
