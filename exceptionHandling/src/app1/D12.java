package app1;

public class D12 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		}
		catch(ArithmeticException ex) {
			System.out.println(41); // The whole catch block skipped even abnormal condition is there,due to there is no abnormal condition inside try block.
			int i = 10 / 0;
			System.out.println(42);
		}
		System.out.println(5);
	}
}
