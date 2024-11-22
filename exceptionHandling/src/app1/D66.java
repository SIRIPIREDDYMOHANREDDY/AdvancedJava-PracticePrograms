package app1;

public class D66 {
	public static void main(String[] args) {
		System.out.println(1);
		if(true) {
			throw new ArithmeticException();
		}
		System.out.println(2);
	}
}
// Throw is used for raise an Exception or Error explicitly.