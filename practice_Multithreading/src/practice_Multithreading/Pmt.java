package practice_Multithreading;

public class Pmt extends Thread {
	public static void main(String[] args) {
		Pmt t1 = new Pmt();
		t1.start();
		for(int i = 0;i<100;i++) {
			System.out.println("first thread"+i);
		}
		
	}
	@Override
public  void run() {
	for(int i =0;i<100;i++) {
		System.out.println("second thread" +i);
	}
}
}