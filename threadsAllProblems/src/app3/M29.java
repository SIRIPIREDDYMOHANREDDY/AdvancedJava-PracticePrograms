package app3;

public class M29 {
	static class A extends Thread {
		ThreadGroup tg;
		A(ThreadGroup tg, String name) {
			super(tg, name);
		}
		@Override
		public void run() {
			for (int i = 1; i <= 1000; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
		}
	}
	static class B implements Runnable {
		@Override
		public void run() {
			for (int i = 1; i <= 1000; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
		}
	}

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("first group");
		A a1 = new A(tg, "1st");
		A a2 = new A(tg, "2nd");
		A a3 = new A(tg, "3rd");
		A a4 = new A(tg, "4th");
		
		B b1 = new B();
		Thread t1 = new Thread(tg,b1,"5th");
		Thread t2 = new Thread(tg,b1,"6th");
		Thread t3 = new Thread(tg,b1,"7th");
		Thread t4 = new Thread(tg,b1,"8th");
		
		tg.setMaxPriority(Thread.MAX_PRIORITY);
		a1.start();
		a2.start();
		a3.start();
		a4.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		tg.stop();	
	}
}
