package app1;

public class D13 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			int i = 10 / 0;
			System.out.println(3);
		}
		catch(ArithmeticException ex) {
			System.out.println(41);
			int i = 10 / 0; // we get exception.But it can't handled the same catch
			System.out.println(42);
		}
		System.out.println(5);
	}
}
