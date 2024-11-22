package app6;

public class M6 {
public static void main(String[] args) {
	new Thread() {
		@Override
		public void run() {
			System.out.println(1);
			int i =10/0;
		}
	}.start();
	for(int i = 1000;i<=2000;i++) {
		System.out.println(i);
	}
}
}
