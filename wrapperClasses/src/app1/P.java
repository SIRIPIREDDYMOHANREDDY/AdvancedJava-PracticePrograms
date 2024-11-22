package app1;

public class P {
	Integer i;
	P() {
		int j = i + 20; // int j = i.intValue() + 20;
		System.out.println(j);		
	}
	public static void main(String[] args) {
		P obj = new P();
	}
}
