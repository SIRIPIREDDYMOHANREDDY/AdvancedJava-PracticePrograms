package app1;

public class M2 extends Thread{
	public static void main(String[] args) {
		M2 obj = new M2();
		obj.start();
		for(int i = 0; i <= 1000; i++) {
			System.out.println("main : " + i);
		}
	}
	
	@Override
	public void run() {
		for(int i = 2000; i <= 3000; i++) {
			System.out.println("test : " + i);
		}
	}
}
// here we get simultaneous execution due to MultiThreading