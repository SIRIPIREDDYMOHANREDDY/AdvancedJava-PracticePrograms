package app1;

public class D16 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			int i = Integer.parseInt("abc");
			System.out.println(i);
			System.out.println(3);
		}
		catch(NullPointerException ex) {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
