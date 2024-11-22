package app4;

class Test {
	int i;
}

public class M2 {
	static class A extends Thread {
		Test t;
		A(Test t) {
			this.t = t;
		}
		public void run() {
			System.out.println("A-1:" + t.i);
			t.i = 10;
			Util.sleep(500);
			System.out.println("A-2:" + t.i);
			t.i = 20;
			Util.sleep(500);
			System.out.println("A-3:" + t.i);
			t.i = 30;
			Util.sleep(500);
			System.out.println("A-4:" + t.i);
			t.i = 40;
			Util.sleep(500);
			System.out.println("A-5:" + t.i);
		}

	}
	static class B extends Thread {
		Test t;

		B(Test t) {
			this.t = t;
		}
		public void run() {
			System.out.println("B-1:" + t.i);
			t.i = 50;
			Util.sleep(500);
			System.out.println("B-2:" + t.i);
			t.i = 60;
			Util.sleep(500);
			System.out.println("B-3:" + t.i);
			t.i = 70;
			Util.sleep(500);
			System.out.println("B-4:" + t.i);
			t.i = 80;
			Util.sleep(500);
			System.out.println("B-5:" + t.i);

		}

	}
	public static void main(String[] args) {
		
		Test t = new Test();
		t.i = 500;
		A a1 = new A(t);
		a1.start();
		Util.sleep(250);

		B b1 = new B(t);
		b1.start();
		Util.sleep(60000);
		System.out.println("main -2:" +t.i);
	}
}


