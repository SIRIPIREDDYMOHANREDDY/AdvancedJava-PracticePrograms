package a1;

import java.util.Scanner;

public class A5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int decimal =sc.nextInt();

		String binary  ="";
		int temp = decimal;

		while(temp>0) {
			int remainder = temp%2;

			System.out.println(remainder);
			binary +=remainder;
			temp = temp/2;

		}
		System.out.println("Binary representation of " + decimal + " is: " + binary);
		String bi= new StringBuilder(binary).reverse().toString();
		System.out.println(bi);
		sc.close();
	}
}
