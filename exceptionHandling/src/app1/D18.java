package app1;

public class D18 {
	public static void main(String[] args) {
		System.out.println(1);
		int i = Integer.parseInt("abc");
		System.out.println(i);
		try {
			System.out.println(2);
			System.out.println(3);
		}
		catch(NumberFormatException ex) {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
