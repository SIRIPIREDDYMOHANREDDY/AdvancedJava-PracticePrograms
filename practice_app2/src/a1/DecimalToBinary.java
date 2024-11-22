package a1;
public class DecimalToBinary {
	public static void main(String[] args) {
		int decimal = 100;  // Example decimal number
		String binary = Integer.toBinaryString(decimal);

		System.out.println("Binary representation of " + decimal + " is: " + binary);
		String b1 = new StringBuilder(binary).reverse().toString();
		System.out.println(b1);

	}
}
