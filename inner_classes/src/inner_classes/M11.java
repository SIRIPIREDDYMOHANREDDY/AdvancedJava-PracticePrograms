package inner_classes;
class Test {
	class A {
		
	}
	static class B {
		
	}
}
public class M11 {
	public static void main(String[] args) {
		Test.A a1 = null;
		Test.B b1 = null;
		
		a1 = new Test().new A();
		Test t1 = new Test();
		a1 = t1.new A();
		
		b1 = new Test.B();
		
		System.out.println("done");
				
	}
}
