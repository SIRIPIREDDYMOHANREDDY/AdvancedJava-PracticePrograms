package pack8;

public class M3 {
	public static void main(String[] args) {
//		B b1 = new B();
		B b2 = new B() {
			void test1() {
				
			}
		};
		b2.test2();
		System.out.println("-------------");
		B b3 = new B() {
			void test1() {
				System.out.println("AIC-test2");
			}
		};
		b3.test1();
		b3.test2();
		System.out.println("-------------");
		
		B b4 = new B() {
			void test1() {
				System.out.println("AIC-test1");
			}
			void test2() {
				System.out.println("AIC-test2");
			}
		};
		b4.test1();
		b4.test2();
		System.out.println("-------------");
	}
}

