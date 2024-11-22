package app1;

import java.util.Scanner;

public class D29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter one int value");
		int i = sc.nextInt();
		try {
			System.out.println(1);
			int j = i / (i - 9);
			System.out.println(2);
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
		}
		finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
