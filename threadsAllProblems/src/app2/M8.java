package app2;

public class M8 {
	static class Shared {
		static void test() {
			System.out.println("test begin");
			synchronized (Shared.class) {
				for (int i = 1; i < 1000; i++) {
					System.out.println("test:" + Thread.currentThread().getName() + ":" + i);
				}
			}
			System.out.println("test end");
		}
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			new Thread() {
				public void run() {
					Shared.test();
				}
			}.start();
		}
		System.out.println("done");
	}
}
//synchronized blocks;