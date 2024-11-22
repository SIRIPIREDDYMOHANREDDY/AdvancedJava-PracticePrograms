package app1;

public class D14 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			int i = 10 / 0;
			System.out.println(3);
		}
		catch(NullPointerException ex) { // the raised exception can't handled by catch because raised exception is arithmetic but catch is NullPointer.
			System.out.println(4);
		}
		System.out.println(5);
	}
}
