package app3;

import app3.M24.A;

public class M25 {
	static class A extends Thread {
		@Override
		public void run() {
			for (int i = 1; i < 2000; i++) {
				System.out.println("child:" + i);
			}
		}
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.setDaemon(true);
		a1.start();
		for (int i = 1; i < 100; i++) {
			System.out.println("main" + i);
		}		
	}
}
