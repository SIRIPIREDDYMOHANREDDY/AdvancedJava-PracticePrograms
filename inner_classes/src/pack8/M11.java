package pack8;

public interface M11 {
	public static void main(String[] args) {
		D obj = test();
		obj.test1();
		obj.test2();
	}
	static D test() {
		return new D() {
			public void test1() {
				System.out.println("from test1.D");
			}
			public void test2() {
				System.out.println("from test2.D");
			}
		};
	}
}
