package app3;

public class M19 {
	static class A extends Thread{
		@Override
		public void run() {
			System.out.println("run");			
		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		System.out.println(a1.getName());
		a1.setName("test");
		System.out.println(a1.getName());
		System.out.println("done");
	}
}
