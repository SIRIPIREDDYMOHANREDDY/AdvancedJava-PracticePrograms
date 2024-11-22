package app1;

public class D20 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			int[] array = new int[5];
			System.out.println(array[5]);
			System.out.println(3);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
