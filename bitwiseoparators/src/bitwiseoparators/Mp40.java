package bitwiseoparators;

public class Mp40 {
    public static void main(String[] args) {
        int decimal = 10000;
        String binary = ""; // Initialize binary as an empty string
        
        while (decimal > 0) {
            // Append the remainder (0 or 1) at the front of the binary string
            binary += (decimal % 2);
            decimal = decimal / 2;
        }
        
        System.out.println("Binary: " + binary);
    }
}
