package app6;

public class M4 {
	static class A extends Thread {
		public void run() {
			System.out.println("child started");
			synchronized (this) {
				try {
					System.out.println("child going to wait");
					wait();
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("state of child now:" + a1.getState());
		synchronized (a1) {
			a1.notify();
		}

	}
}
