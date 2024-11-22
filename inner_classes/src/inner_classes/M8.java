package inner_classes;
class A{
	void m1() {
		System.out.println("A-m1");
	}
}
class B extends A{
	void m1() {
		System.out.println("B-m1 begin");
		super.m1();
		System.out.println("B-m1 end");
	}
	
	void test() {
		m1();
		super.m1();
	}
}
public class M8 {
	public static void main(String[] args) {
		B obj = new B();
		obj.m1();
		System.out.println("----------");
		obj.test();
	}
}
