package app6;

public class M8 {
public static void main(String[] args) {
	class A extends Thread{
		@Override
		public void run() {
			for(int i =1;i<=1000;i++) {
				System.out.println(i);
			}
		}
	}
	A a1 = new A();
	a1.start();
	a1.start();
	System.out.println("done");
}
}
