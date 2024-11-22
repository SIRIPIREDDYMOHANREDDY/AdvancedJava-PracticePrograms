package app3;

public class M22 {
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
		A a1 = new A();
		a1.start();
		
		System.out.println("done");
	}
}
