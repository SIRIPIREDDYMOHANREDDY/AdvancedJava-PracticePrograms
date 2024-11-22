package app1;

public class M5 {
	static class A extends Thread {
		@Override
		public void run() {
			for(int i = 5000; i <= 6000; i++) {
				System.out.println("A-run :" + i);
			}
		}
	}
	static class B extends Thread{
		@Override
		public void run() {
			for(int i = 15000; i <= 16000; i++) {
				System.out.println("B-run :" + i);
			}
		}
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		B b1 = new B();
		b1.start();
		for(int i = 25000; i <= 26000; i++) {
			System.out.println("main :" + i);
		}
	}
}
