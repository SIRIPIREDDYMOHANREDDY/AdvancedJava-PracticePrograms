package pack8;

public class M6 {
	public static void main(String[] args) {
		A a1 = m1();
		a1.test1();
		a1.test2();
		System.out.println("--------");
		B b1 = m2();
		b1.test1();
		b1.test2();
	}
	static A m1() {
		return new A() {
			void test2() {
				System.out.println("AIC-test2");
			}
		};
	}
	static B m2() {
		return new B() {
			void test1() {
				System.out.println("AIC-test1");
			}
		};
	}
}
