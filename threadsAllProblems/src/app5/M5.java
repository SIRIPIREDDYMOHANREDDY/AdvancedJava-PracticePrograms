package app5;

public class M5 {
	static class Shared {
		synchronized void test1() {
			System.out.println(Thread.currentThread().getName() + ": test1 begin");
			try {
				wait();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":test1 end");
		}
		synchronized void test2() {
			System.out.println(Thread.currentThread().getName() + ": test2 begin");
			// notify();
			notifyAll();
			System.out.println(Thread.currentThread().getName() + ":test2 end");
		}
	}
	static class A extends Thread {
		Shared s1;
		A(Shared s1) {
			this.s1 = s1;
		}
		@Override
		public void run() {
			s1.test1();
		}
	}
	static class B extends Thread {
		Shared s1;

		B(Shared s1) {
			this.s1 = s1;
		}
		@Override
		public void run() {
			s1.test1();
		}
	}
	static class C extends Thread {
		Shared s1;

		C(Shared s1) {
			this.s1 = s1;
		}
		@Override
		public void run() {
			s1.test1();
		}
	}
	static class D extends Thread {
		Shared s1;
		D(Shared s1) {
			this.s1 = s1;
		}
		@Override
		public void run() {
			s1.test1();
		}
	}
	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();

		A a1 = new A(s1);
		a1.start();
		B b1 = new B(s1);
		b1.start();

		C c1 = new C(s2);
		c1.start();

		D d1 = new D(s2);
		d1.start();

		Util.sleep(10000);
		s1.test2();
		s2.test2();
	}
}
//Synchronized is must and should be there in inter thread communication
//notify is a one notification
//notifyAll is a more notifications