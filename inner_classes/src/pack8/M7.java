package pack8;

public class M7 {
	public static void main(String[] args) {
		A a1 = new A() {
			void test3() {
				System.out.println("test3");
			}
			void test1() {
				System.out.println("test1 begin");
				test3();
				System.out.println("test1 end");
			}
		};
		//a1.test3();
		a1.test1();
	}
}
