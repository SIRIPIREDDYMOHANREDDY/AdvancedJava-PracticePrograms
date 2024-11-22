package inner_classes;

public class M10 {
	class A {
		
	}
	
	static class B{
		int j;
	}
	public static void main(String[] args) {
		A a1 = null;
		B b1 = null;
		
		//a1 = new A();
		b1 = new B();
		M10 obj = new M10();
		a1 = obj.new A();
		
		System.out.println("done");
	}
}