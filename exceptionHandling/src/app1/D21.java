package app1;

public class D21 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			StringBuffer[] array = new StringBuffer[999999999];
			for(int i = 0; i < array.length; i++) {
				array[i] = new StringBuffer("abc");
			}
			System.out.println(3);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
