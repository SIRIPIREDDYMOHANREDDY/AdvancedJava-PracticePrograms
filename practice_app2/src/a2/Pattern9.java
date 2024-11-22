package a2;

public class Pattern9{
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int even = 2 * i;
			for (int j = 1; j <= 10; j++) {
				System.out.println(even + "X" + j + "=" + even * j);

			}
			System.out.println();
		}

	}
}