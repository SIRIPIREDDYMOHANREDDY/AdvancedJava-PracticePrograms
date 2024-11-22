package a1;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input binary number as a string
		System.out.print("Enter a binary number: ");
		String binaryString = scanner.nextLine();

		// Initialize variables
		int decimalValue = 0;
		int base = 1;  // Start with base value of 2^0 (1)

		// Traverse the binary string from right to left
		for (int i = binaryString.length() - 1; i >= 0; i--) {
			// Get the current character
			char binaryChar = binaryString.charAt(i);

			// Convert the character '0' or '1' to integer and multiply by the base
			if (binaryChar == '1') {
				decimalValue += base;
			}

			// Update the base (multiply by 2 for each iteration)
			base *= 2;
		}

		System.out.println("Decimal value: " + decimalValue);
	}
}






