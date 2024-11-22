package app3;

public class M10 {
	public static void main(String[] args) {
		new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
		}).start();

		for (int i = 7000; i <= 7000; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
