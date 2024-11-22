package app3;
public class M18 {
	static class A extends Thread{
		@Override
		public void run() {
			Thread t1 = Thread.currentThread();
			System.out.println(t1.getId());
			System.out.println(t1.getName());
			System.out.println(t1.getPriority());
			System.out.println(t1.isDaemon());
			
		}
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.run();
		System.out.println("done");
	}
}
