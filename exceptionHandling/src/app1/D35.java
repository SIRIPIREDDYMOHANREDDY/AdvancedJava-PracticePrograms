package app1;

public class D35 {
	public static void main(String[] args) {
		try{
			System.out.println();
			System.exit(0);
			System.out.println(2);
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
		}
		// even though control entered into try block finally block not executed because there is System.exit(0) in the try block.
		// finally block should be the last block when try and catch used.
		// finally block is optional
		finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
