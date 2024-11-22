package t3;

public class B implements A {
	@Override
	public void test1() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		A.test2();
		// B.test2();
		B b1 = new B();
		b1.test4();
	}

}