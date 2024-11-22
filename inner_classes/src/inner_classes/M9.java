package inner_classes;

public class M9 {
	class A {
		
	}
	
	static class B {
		
	}
	
	public static void main(String[] args) {
		System.out.println("done");
		
		A a1 = null;// A can be used as data type
		B b1 = null;
		
//		a1 = new A();// but A can't be used for object creation because A is non static
		b1 = new B();
	}
}
