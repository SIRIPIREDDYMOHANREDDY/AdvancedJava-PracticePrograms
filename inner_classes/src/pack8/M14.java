package pack8;

interface F {
	void test(int i);
}

public class M14 {
	public static void main(String[] args) {
		F f1 = (int i) -> {
			System.out.println("from test1:" + i);
		};
		
		f1.test(10);
		f1.test(52);
		f1.test(47);
		f1.test(17);
	}
}
