package app1;

import java.util.Scanner;

public class D69 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age <= 0) {
			throw new ArithmeticException("age should be greater then zero");
		}
		//continue.....
		System.out.println("continue......");
	}
}
