package pack8;

public class M5 {
	public static void main(String[] args) {
		m1(new B() {
			void test1() {
				System.out.println("from AIC-test1");
			}
		});
	}
	static void m1(B b1) {
		b1.test1();
		b1.test2();
	}
}
