package app3;

public class M23 {
	static class A extends Thread{
		@Override
		public void run() {
		Thread t1 = Thread.currentThread();
			System.out.println("run:" + t1.getPriority());	
			t1.setPriority(MIN_PRIORITY);
			System.out.println("run:" + t1.getPriority());			
		}
	}
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		main.setPriority(Thread.MAX_PRIORITY);
		A a1 = new A();
		a1.start();
		
		System.out.println("done");
	}
}
