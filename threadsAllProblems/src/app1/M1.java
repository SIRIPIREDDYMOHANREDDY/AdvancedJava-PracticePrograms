package app1;

public class M1 {
	public static void main(String[] args) {
		for(int i = 0; i <= 1000; i++) {
			System.out.println("main : " + i);
		}
		test();
	}
	public static void test() {
		for(int i = 2000; i <= 3000; i++) {
			System.out.println("test : " + i);
		}
	}
}
// it execute sequential execution  main method one after  test