package app3;

class A implements Runnable{
	@Override
	public void run() {
		for(int i = 1;i<=1000;i++) {
			System.out.println(Thread.currentThread().getName() +":" +i);
			}		
	}
}
public class M2 {
public static void main(String[] args) {
	A a1 = new A();
	Thread  t1 = new Thread(a1);
	t1.start();
	
	for(int i =4000;i<=5000;i++) {
		System.out.println(Thread.currentThread().getName() +":" +i);
	}
}
}
