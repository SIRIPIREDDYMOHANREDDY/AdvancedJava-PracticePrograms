package app1;

public class M10 {
	static Thread getThread() {
		return new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " : done");
			}
		};
	}
	
	public static void main(String[] args) {
		Thread t1 = getThread();
		t1.start();
		System.out.println(Thread.currentThread().getName() + " : done");
	}
}
