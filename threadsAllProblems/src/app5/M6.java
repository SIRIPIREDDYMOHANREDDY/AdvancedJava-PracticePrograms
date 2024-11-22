package app5;

public class M6 {
	static class A extends Thread {
		@Override
		public void run() {
			System.out.println("A - begin");
			synchronized (this) {
				System.out.println("block begin");
				try {
					wait();

				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				System.out.println("block end");
			}
			System.out.println("A-end");
		}
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		Util.sleep(50000);
		System.out.println("after 50 seconds");
		synchronized (a1) {
		a1.notify();	
		}
		
	}
}
