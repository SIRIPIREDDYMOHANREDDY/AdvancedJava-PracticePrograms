package app3;

public class M7 {
	public static void main(String[] args) {
		 new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		}).start();

		for (int i = 7000; i <= 7000; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
