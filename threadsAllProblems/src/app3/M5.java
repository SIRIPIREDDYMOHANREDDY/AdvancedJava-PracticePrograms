package app3;

public class M5 {
	public static void main(String[] args) {

		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		};
	    Thread t1 = new Thread(r1);
		t1.start();

		for (int i = 7000; i <= 7000; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
