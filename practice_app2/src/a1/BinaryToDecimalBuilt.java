package a1;

import java.util.Scanner;

public class BinaryToDecimalBuilt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input binary number as a string
		System.out.print("Enter a binary number: ");
		String binaryString = scanner.nextLine();

		// Convert binary string to decimal integer
		int decimalValue = Integer.parseInt(binaryString, 2);

		// Output the decimal value
		System.out.println("Decimal value: " + decimalValue);
	}
}

