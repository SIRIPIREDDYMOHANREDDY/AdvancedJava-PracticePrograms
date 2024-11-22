package app5;

public class M7 {
	static class Test {
		synchronized void t1() {
			System.out.println("t1 begin");
			try {
				wait();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println("t1 end");
		}

		synchronized void t2() {
			System.out.println("t2 begin");
			notify();
			System.out.println("t2 end");
		}
	}

	static class A extends Thread {
		Test obj;

		A(Test obj) {
			this.obj = obj;
		}

		@Override
		public void run() {
			obj.t1();
		}
	}

	public static void main(String[] args) {
		Test obj = new Test();
		A a1 = new A(obj);
		a1.start();
		Util.sleep(5000);
		obj.t2();
	}
}
