package app1;

public class D10 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		}
		catch(ArithmeticException ex) {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
