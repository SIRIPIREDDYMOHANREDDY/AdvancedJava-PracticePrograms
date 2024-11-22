package app5;

public class M2 {
	static class A extends Thread {
		@Override
		public void run() {
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
		a1.notify();
	}
}
