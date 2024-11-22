package app3;



public class M21 {
static class A implements Runnable{
	
		@Override
		public void run() {
			System.out.println("run");			
		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		Thread t1 = new Thread(a1, "first child thread");
		t1.start();
		System.out.println(t1.getName());
		System.out.println("done");
	}
}
