package app1;

public class M6 {
	public static void main(String[] args) {
		class A extends Thread{
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					System.out.println("child :" + i);
				}
			}
		}
		
		A a1 = new A();
		a1.start();
		for(int i = 6000; i <= 7000; i++) {
			System.out.println("parent :" + i);
		}
	}
}
