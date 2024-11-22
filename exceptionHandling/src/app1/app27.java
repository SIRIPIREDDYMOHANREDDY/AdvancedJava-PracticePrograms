package app1;

public class app27 {
	public static void main(String[] args) {
//		try {
//			
//		}
//		
//		
//		catch(ArithmeticException ex) {
//			
//		}
		
		
//		try {
//			
//		}
//		System.out.println(1);
//		catch(ArithmeticException ex) {
//			
//		}
		
//		try {
//			
//		}
//		
//		
//		catch() {
//			
//		}
		
//		try {
//			
//		}
//		
//		
//		catch(ArithmeticException ex, NullPointerException ex1) {
//			
//		}
		
		try {
			
		}
		catch(ArithmeticException ex) {
			//some execution
		}
		catch(NullPointerException ex) {
			//different statements
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			//different statements
		}
		
		try {
			
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException ex) {
			//same execution
		}
	}
}
