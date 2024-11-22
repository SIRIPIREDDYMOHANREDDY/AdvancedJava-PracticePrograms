package app2;

public class M7 {
	static class Shared {
		void test() {
			System.out.println("test begin");
			synchronized (this) {
				for (int i = 1; i <= 1000; i++) {
					System.out.println("test" + Thread.currentThread().getName() + ":" + i);
				}
			}
			System.out.println("test end");
		}
	}
	static class A extends Thread{
		Shared s1;
		A(Shared s1){
			this.s1 = s1;
		}
		public void run() {
			s1.test();
		}
	}
	public static void main(String[] args) {
		Shared s1 = new Shared();
		A a1 = new A(s1);
		a1.start();
		A a2 = new A(s1);
		a2.start();
	}
}
