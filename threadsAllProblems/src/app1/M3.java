package app1;

public class M3 {
	static class A extends Thread {
		@Override
		public void run() {
			for(int i = 5000; i <= 6000; i++) {
				System.out.println("run :" + i);
			}
		}
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		for(int i = 25000; i <= 26000; i++) {
			System.out.println("main :" + i);
		}
	}
}
