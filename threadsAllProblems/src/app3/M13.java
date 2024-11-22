package app3;

public class M13 {
public static void main(String[] args) {
	Thread t1 = Thread.currentThread();
	System.out.println(t1.getPriority());
	t1.setPriority(10);
	System.out.println(t1.getPriority());
}
}
//between 1 to 10
//5 is normal priority
//10 is maximum priority