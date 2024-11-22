package app1;

public class M11 {
	static Thread getThread() {
		return new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + " : done");
			}
		};
	}
	
	public static void main(String[] args) {
		getThread().start();
		System.out.println(Thread.currentThread().getName() + " : done");
	}
}
