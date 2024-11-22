package app1;

public class L {
	static void test1(Integer obj) {
		System.out.println("test1");
	}
	
	public static void main(String[] args) {
		int i = 10;
		test1(i);   // test1(Integer.valueOf(i));
	}
}
