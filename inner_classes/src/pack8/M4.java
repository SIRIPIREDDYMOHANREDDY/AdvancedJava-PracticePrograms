package pack8;

public class M4 {
	public static void main(String[] args) {
		A a1 = new A();
		m1(a1);
		System.out.println("---------");
		m1(new A(){
			void test1() {
				System.out.println("AIC-test1");
			}
		});
		System.out.println("---------");
		m1(new A(){
			void test2() {
				System.out.println("AIC-test2");
			}
		});
		System.out.println("---------");
		m1(new A(){
			void test1() {
				System.out.println("AIC-test1");
			}
			void test2() {
				System.out.println("AIC-test2");
			}
		});
		System.out.println("---------");
	}
	static void m1(A obj) {
		obj.test1();
		obj.test2();
	}
}
