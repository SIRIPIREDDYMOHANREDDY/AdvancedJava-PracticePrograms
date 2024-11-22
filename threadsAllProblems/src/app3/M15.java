package app3;

public class M15 {
public static void main(String[] args) {
	Thread t1 = Thread.currentThread();
	System.out.println(t1.getPriority());
	t1.setPriority(Thread.MAX_PRIORITY);
	System.out.println(t1.getPriority());
}
}
