package app5;

public class M4 {
	static class Shared {
		synchronized void test1() {
			System.out.println(Thread.currentThread().getName() + ":" + "test begin");
			try {
				wait();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + "test1 end");
		}
synchronized void test2() {
			notify();
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
	public static void main(String[] args) {
		Shared obj = new Shared();
		A a1 = new A(obj);
		a1.start();
		Util.sleep(10000);
		obj.test2();
	}
}
