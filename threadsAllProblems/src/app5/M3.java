package app5;

public class M3 {
	static class A extends Thread {
		@Override
		public synchronized void run() {
			System.out.println("A-run-begin");
			try {
				wait();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println("A-run-end");
		}
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		Util.sleep(10000);
		synchronized (a1) {
			a1.notify();

		}
	}
}

