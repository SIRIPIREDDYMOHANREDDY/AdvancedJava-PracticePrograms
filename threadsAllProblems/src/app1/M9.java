package app1;

public class M9 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			new Thread() {
				public void run() {
					System.out.println(Thread.currentThread().getName() + "done");
				}  
			}.start();
		}
		
		System.out.println(Thread.currentThread().getName() + "done");
	}
}
// child thread names start from Thread-0.