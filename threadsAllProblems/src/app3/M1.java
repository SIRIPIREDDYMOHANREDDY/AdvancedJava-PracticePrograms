package app3;

public class M1  implements Runnable{
	@Override
	public void run() {
		for(int i =1;i<=1000;i++) {
			System.out.println(Thread.currentThread().getName() +":" +i);		
	}
}
	public static void main(String[] args) {
		M1 obj = new M1();
		Thread t1 = new Thread(obj);
		t1.start();
		for(int i = 5000; i<=6000;i++) {
			System.out.println(Thread.currentThread().getName() +":" +i);		
		}
	}

}
