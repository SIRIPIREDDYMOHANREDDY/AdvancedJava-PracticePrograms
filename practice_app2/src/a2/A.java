package a2;

public class A {
	public static void main(String[] args) {
		String binary="100100";
		int decimal=0;
		int base =1;
		for(int i =binary.length()-1;i>=0;i--) {
			char c1 = binary.charAt(i);
			if(c1 == '1') {
				decimal +=base;
			}
			base *= 2;
		}
		System.out.println(decimal);
	}

}
