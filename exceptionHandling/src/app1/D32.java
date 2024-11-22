package app1;

public class D32 {
	public static void main(String[] args) {
		System.out.println(1);
		int i = 10 / 0;
		try {
			System.out.println(2);
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
		}
		// exception occur before try finally block not executed.
		finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
