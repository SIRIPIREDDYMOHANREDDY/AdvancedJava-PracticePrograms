package pack8;

public class M9 {
	public static void main(String[] args) {
//		D d1 = new D();
		D d2 = new D() {
			@Override
			public void test1() {
				System.out.println("from test1");
			}
			
			@Override
			public void test2() {
				System.out.println("from test2");
			}
		};
		d2.test1();
		d2.test2();
	}
}
