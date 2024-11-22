package app6;

public class M5 {
static class A extends Thread{
	public void run() {
		for(int i =1;i<=1000;i++) {
			System.out.println(i);
			//yield();
		}
	}
}
static class B extends Thread{
	public void run() {
		for(int i =5000;i<=6000;i++) {
	    System.out.println(i);
		//yield();
}
}
}
public static void main(String[] args) {
	A a1 = new A();
	a1.start();
	
	B b1 = new B();
	b1.start();
}
}
