package app1;

import java.util.Scanner;

public class D68 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age < 10) {
			throw new ArithmeticException();
		}
		//continue.....
		System.out.println("continue......");
	}
}
