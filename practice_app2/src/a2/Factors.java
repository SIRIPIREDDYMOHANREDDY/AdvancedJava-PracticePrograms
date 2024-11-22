package a2;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive number to find its factors: ");
		int customerNumber = scanner.nextInt();
		if (customerNumber > 0) {
			printFactors(customerNumber);
		} else {
			System.out.println("Please enter a valid positive number.");
		}
		scanner.close();

	}
	private static void printFactors(int customerNumber) {
		int i=1;
		while(i<=customerNumber/2) {
			if(customerNumber%i==0) {
				System.out.println(i  +" ");
			}
			i++;
		}
		System.out.println(customerNumber);
		System.out.println();
	}

}

