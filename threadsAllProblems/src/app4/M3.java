package app4;

public class M3 {
	static class A extends Thread {
		ThreadLocal<Integer> t;
		A(ThreadLocal<Integer> t) {
			this.t = t;
		}
		public void run() {
			System.out.println("A-1:" + t.get());
			t.set(10);
			Util.sleep(500);
			System.out.println("A-2:" + t.get());
			t.set(20);
			Util.sleep(500);
			System.out.println("A-3:" + t.get());
			t.set(30);
			Util.sleep(500);
			System.out.println("A-4:" + t.get());
			t.set(40);
			Util.sleep(500);
			System.out.println("A-5:" + t.get());
		}
	}
	static class B extends Thread {
		ThreadLocal<Integer> t;
	B(ThreadLocal<Integer> t){
		this.t=t;
	}
		public void run() {
			System.out.println("B-1:" + t.get());
			t.set(60);
			Util.sleep(500);
			System.out.println("B-2:" + t.get());
			t.set(70);
			Util.sleep(500);
			System.out.println("B-3:" + t.get());
			t.set(80);
			Util.sleep(500);
			System.out.println("B-4:" + t.get());
			t.set(90);
			Util.sleep(500);
			System.out.println("B-5:" + t.get());
		}
	}
	public static void main(String[] args) {
		ThreadLocal<Integer> t = new ThreadLocal<Integer>();
		t.set(500);
		System.out.println("main-1:" + t.get());
		A a1 = new A(t);
		a1.start();
		Util.sleep(250);
		B b1 = new B(t);
		b1.start();
		Util.sleep(60000);
		System.out.println("main-2:" + t.get());

	}
}
