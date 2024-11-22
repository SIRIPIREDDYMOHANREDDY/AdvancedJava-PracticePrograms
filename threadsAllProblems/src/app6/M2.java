package app6;

public class M2 {
	static class A extends Thread{
	@Override
		public void run() {
			for(int i =0;i<=1000;i++) {
				System.out.println(i);
			}
		}	
	}
public static void main(String[] args) {
	A a1 = new A();
	System.out.println("state1:" +a1.getState());
	a1.start();
	System.out.println("state2:" +a1.getState());
	
	try {
	Thread.sleep(2);	
	}
	catch(InterruptedException ex) {
		System.out.println(ex);
	}
	System.out.println("state3:" + a1.getState());
	try {
		Thread.sleep(5000);	
	}
	catch(InterruptedException ex) {
		System.out.println(ex);
	}
	System.out.println("state4:" + a1.getState());
}
}
