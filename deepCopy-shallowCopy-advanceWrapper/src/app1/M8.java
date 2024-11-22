package app1;

public class M8 {
	public static void main(String[] args) {
		test(10);
		test(10, "abc");
		test(10, "abc", "xyz");
		test(10, "hello", "abc", "xyz");
		test(10, "test", "hello", "abc", "xyz");
	}
	static void test(int i, String ...strings) {
		System.out.println(i + ", " + strings.length);
		for(String s1 : strings) {
			System.out.print(s1 + ", ");
		}
		System.out.println();
		System.out.println("---------");
	}
	
}
// method can have max one var arg argument
// var arg argument is array by default
// var arg argument should be last argument for a method