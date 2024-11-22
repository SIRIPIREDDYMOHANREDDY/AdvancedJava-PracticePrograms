package app6;

public class M7 {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println(1);
				System.out.println(2);
			}
		}.start();
		
		
		int i = 10/0;
		System.out.println("done");
		}
	}
	


