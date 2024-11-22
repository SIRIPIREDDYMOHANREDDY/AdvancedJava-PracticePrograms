package pack8;

public class M12 {
	public static void main(String[] args) {
//		E e1 = new E();
		E e2 = new E() {
				public void test1() {
				System.out.println("AIC-test1");
			}
		};
		
		E e3 = () -> System.out.println("Lambda-exp-test1");
		
		e2.test1();
		e3.test1();
	}
}
