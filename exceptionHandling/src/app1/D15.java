package app1;

public class D15 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			String s1 = null;
			System.out.println(s1.length());
			System.out.println(3);
		}
		catch(NullPointerException ex) {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
