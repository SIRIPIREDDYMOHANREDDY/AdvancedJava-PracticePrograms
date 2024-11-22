package pack8;

public class M2 {
	public static void main(String[] args) {
		// Anonymous inner class
		A a1 = new A() {
			void test1() {
				System.out.println("AIC-test1");
			}
		};
		a1.test1();
		a1.test2();
		System.out.println("--------------");
		
		A a2 = new A() {
			void test2() {
				System.out.println("AIC-test2");
			}
		};
		a2.test1();
		a2.test2();
		System.out.println("------------");
		
		A a3 = new A() {
			void test1() {
				System.out.println("AIC-test1");
			}
			void test2() {
				System.out.println("AIC-test2");
			}
		};
		a3.test1();
		a3.test2();
		System.out.println("------------");
		
		A a4 = new A() {
	
		};
		a4.test1();
		a4.test2();
	}
}
// For Anonymous inner class has no name
// we use super class name as class name
// so all members of super class inherited to anonymous inner  