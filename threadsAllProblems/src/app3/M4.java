package app3;

public class M4 {
	public static void main(String[] args) {

		class A implements Runnable {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		}
        A a1 = new A();
		Thread t1 = new Thread(a1);
		t1.start();

		for (int i = 7000; i <= 7000; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
