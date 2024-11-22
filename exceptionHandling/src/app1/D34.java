package app1;

public class D34 {
	public static void main(String[] args) {
		int i = test();
		System.out.println(i);
	}
	public static int test() {
		System.out.println(1);
		try {
			System.out.println(2);
			return 10;
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
			return 3;
		}
		// once control entered inside try block finally block will execute no matter what is happening.
		// even though return statement in the try block it will return after finally block executed.
		finally {
			System.out.println(4);
		}
	}
}
