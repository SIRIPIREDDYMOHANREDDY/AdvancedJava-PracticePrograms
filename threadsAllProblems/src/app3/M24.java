package app3;



public class M24 {
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
		a1.start();
		System.out.println("done");
	}
}
