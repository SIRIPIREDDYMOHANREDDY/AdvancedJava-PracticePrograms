package app1;

public class M8 {
	public static void main(String[] args) {
		new Thread(){
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					System.out.println("child :" + i);
				}
			}
		}.start();
		for(int i = 6000; i <= 7000; i++) {
			System.out.println("parent :" + i);
		}
	}
}
