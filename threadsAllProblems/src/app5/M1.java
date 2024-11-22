package app5;

//dead lock;
class Util {
	static void sleep(long millies) {
		try {
			Thread.sleep(millies);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
class Shared {
	synchronized void test1(Shared obj) {
		System.out.println("test1 begin by" + Thread.currentThread().getName());
		Util.sleep(1000);
		obj.test2(this);
		System.out.println("test1 end by" + Thread.currentThread().getName());
	}
	synchronized void test2(Shared obj) {
		System.out.println("test2 begin by" + Thread.currentThread().getName());
		Util.sleep(1000);
		obj.test1(this);
		System.out.println("test2 end by" + Thread.currentThread().getName());
	}
}
class A extends Thread {
	Shared s1, s2;
	A(Shared s1, Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	public void run() {
		s1.test1(s2);
	}
}
class B extends Thread {
	Shared s1, s2;

	B(Shared s1, Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public void run() {
		s2.test2(s1);
	}
}
public class M1 {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		A a1 = new A(s1, s2);
		a1.start();
		Util.sleep(100);
		B b1 = new B(s1, s2);
		b1.start();
		Util.sleep(10000);
		System.out.println(a1.getState());
		System.out.println(b1.getState());
		System.out.println("main end");
	}
}
