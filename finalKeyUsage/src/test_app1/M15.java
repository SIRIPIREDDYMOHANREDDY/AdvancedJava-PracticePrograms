package test_app1;
class B{
	final int i = 1000;
}
public class M15 {
	public static void main(String[] args) {
		B b1 = new B();
		b1 = new B();
		b1 = null;
		b1 = new B();
	//	b1.i = 1000;
	}
}

// here i is final and b1 is not final.