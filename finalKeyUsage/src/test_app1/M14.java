package test_app1;
class A {
	int i;
}
public class M14 {
	public static void main(String[] args) {
		final A a1 = new A();
		a1.i = 3000;
		a1.i = 13000;
		a1.i = 22222000;
		
//		a1 = new A();
//		a1 = null;
	}
}
// here a1 is final but i is not final. So a1 is not modified.