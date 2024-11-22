package app1;

public class M7 {
	public static void main(String[] args) {
		test();
		test(4);
		test(6, 9);
		test(10, 20);
		test(1222, 30, 40, 56);
		test(0, 4);
		test(1, 2, 3, 4, 1, 2, 4, 6);
	}
	static void test(int ...is) { // var arg method 
		System.out.println("var args method");
	}
}
// var arg argument method call any no of arguments
// variable no of same type of arguments
// no matter how many arguments are there compiler automatically keep all parameter inside method while calling the method