package app1;

public class D25 {
	public static void main(String[] args) {
		System.out.println(1);
		if(args.length == 0) {
			System.out.println("pls supply command line arg");
			return;
		}
		System.out.println(2);
		try {
			System.out.println(3);
			int i = Integer.parseInt(args[0]);
			System.out.println(4);
			int j = i /(i - 10);
			System.out.println(5);
			int[] array = new int[10];
			System.out.println(array[i]);
			System.out.println(6);
		}
		catch(NumberFormatException ex) {
			System.out.println(7);
		}
		catch(ArithmeticException ex) {
			System.out.println(8);
		}
		System.out.println(9);
	}
}
