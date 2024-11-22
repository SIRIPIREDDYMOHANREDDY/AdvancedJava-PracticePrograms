package app4;

public class M1 {
	static class A extends Thread {
		@Override
		public void run() {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				Util.sleep(1000);
			}

		}
	}

	static class B extends Thread {
		@Override
		public void run() {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				Util.sleep(3000);
			}

		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		B b1 = new B();
		b1.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			Util.sleep(6000);
		}
	}
}
