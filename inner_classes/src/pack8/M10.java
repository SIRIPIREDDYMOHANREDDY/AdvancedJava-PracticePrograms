package pack8;

public interface M10 {
	public static void main(String[] args) {
		m1(new D() {
			public void test1() {
				System.out.println("from D.test1");
			}
			public void test2() {
				System.out.println("from D.test2");
			}
		});
	}
	
	static void m1(D d1) {
		d1.test1();
		d1.test2();
	}
}