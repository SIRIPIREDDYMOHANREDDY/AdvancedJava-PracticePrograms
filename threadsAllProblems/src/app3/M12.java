package app3;

public class M12 {
public static void main(String[] args) {
	Thread t1 = Thread.currentThread();
	System.out.println(t1.getName());
	t1.setName("first-thread");
	System.out.println(t1.getName());
}
}
