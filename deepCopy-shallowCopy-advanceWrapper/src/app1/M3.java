package app1;

public class M3{
	public static void main(String[] args) {
		try {
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
			System.out.println(3);
			System.out.println(3);
			System.out.println(3);
			System.out.println(3);
			System.out.println(3);
			throw new ArithmeticException(ex.getMessage());
		}
	}
}
// In the catch body we are re-throwing the same exception it is called re-throw