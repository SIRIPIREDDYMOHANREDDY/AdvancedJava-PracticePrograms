package app1;

public class D8 {
	public static void main(String[] args) {
		System.out.println(1);
		StringBuffer[] array = new StringBuffer[999999999];
		for(int i = 0; i < array.length; i++) {
			array[i] = new StringBuffer("abc");
		}
		System.out.println(2);
	}
}
 