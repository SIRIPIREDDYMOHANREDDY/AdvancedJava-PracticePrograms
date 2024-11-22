package pack7;

public class M2 {
	public static void main(String[] args) {
		class A {
			void test() {
				System.out.println("from test");
			}
		}
		A a1 = new A();
		a1.test();
		System.out.println("done");
	}
}
