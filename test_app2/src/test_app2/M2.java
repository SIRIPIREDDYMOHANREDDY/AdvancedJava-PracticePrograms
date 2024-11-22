package test_app2;

public class M2 {
	public static void main(String[] args) {
		int i = test1();
		int j = test2();
		System.out.println(i);
		System.out.println(j);
	}
	static int test1() {
		try {
			return 10;
		}
		catch(ArithmeticException ex) {
			return 15;
		}
		finally {
			return 20;
		}
	}
	static int test2() {
		try {
			int i = 10 / 0;
			return 10;
		}
		catch(ArithmeticException ex) {
			return 15;
		}
		finally {
			return 20;
		}
	}
}
