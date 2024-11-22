package app1;

import java.util.Scanner;

public class D30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something");
		int i = sc.nextInt();
		try {
			System.out.println(1);
			int j = i / (i - 9);
			System.out.println(2);
			int[] array = new int[5];
			System.out.println(array[i]);
			System.out.println(3);
		}
		catch(ArithmeticException ex) {
			System.out.println(4);
		}
		// even though flow terminated due to exception finally block is executes then flow terminates. 
		finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
}
