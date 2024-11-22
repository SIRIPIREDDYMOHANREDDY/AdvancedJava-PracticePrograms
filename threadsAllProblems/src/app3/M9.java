package app3;

public class M9 {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			for (int i = 1; i <= 1000; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
		};
		new Thread(r1).start();
		for (int i = 7000; i <= 7000; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}