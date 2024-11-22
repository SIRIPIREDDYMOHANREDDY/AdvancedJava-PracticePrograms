package app3;

public class M20 {
	static class A extends Thread{
		
		
		A(String name){
			super(name);
		}
		@Override
		public void run() {
			System.out.println("run");			
		}
	}
	public static void main(String[] args) {
		A a1 = new A("first child thread");
		a1.start();
		System.out.println(a1.getName());
		System.out.println("done");
	}
}
