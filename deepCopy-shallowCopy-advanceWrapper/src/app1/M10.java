package app1;

public class M10 {
//	static void test(byte b1) {
//		System.out.println("byte primitive");
//	}
//	static void test(int b1) {
//		System.out.println("int primitive");
//	}
//	static void test(Byte b1) {
//		System.out.println("Byte Wrapper");
//	}
	static void test(Integer b1) {
		System.out.println("Integer Wrapper");
	}
//	static void test(Number b1) {
//		System.out.println("Number type");
//	}
//	static void test(Object b1) {
//		System.out.println("Object type");
//	}
	static void test(byte ...b1) {
		System.out.println("var arg type");
	}
	public static void main(String[] args) {
		byte b1 = 10;
		test(b1);
	}
}

/* Preference
1) Auto widening
2) Auto boxing
   2.1) Auto upcasting
3) var arg
*/