package app1;

public class D67 {
	public static void main(String[] args) {
		System.out.println(1);
		if(true) {
			throw new OutOfMemoryError();
		}
		System.out.println(2);
	}
}
