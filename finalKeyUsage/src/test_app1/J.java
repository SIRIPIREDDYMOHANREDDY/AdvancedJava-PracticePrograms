package test_app1;

public class J {
	static final int a;
	final static int b = 100;
	
	static {
		a = 90;
	}
	
	public static void main(String[] args) {
		System.out.println("done");
	}
}
// 'a' initialized in the SIB