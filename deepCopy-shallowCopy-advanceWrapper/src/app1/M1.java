package app1;

class A {
	int i;
}

class B implements Cloneable {
	A a1;
	int j;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		B obj = (B) super.clone();
		int temp = obj.a1.i;
		obj.a1 = new A();
		obj.a1.i = temp;
		return obj;
	}
}
public class M1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		B b1 = new B();
		b1.a1 = new A();
		b1.a1.i = 100;
		b1.j = 200;
		
		B b2 = (B) b1.clone();
		System.out.println(b1.j);
		System.out.println(b1.a1.i);
		System.out.println(b2.j);
		System.out.println(b2.a1.i);
		System.out.println("---------");
		b1.a1.i = 400;
		b1.j = 800;
		System.out.println(b1.j);
		System.out.println(b1.a1.i);
		System.out.println(b2.j);
		System.out.println(b2.a1.i);
		System.out.println("---------");
		b2.a1.i = 500;
		b2.j = 600;
		System.out.println(b1.j);
		System.out.println(b1.a1.i);
		System.out.println(b2.j);
		System.out.println(b2.a1.i);
		System.out.println("---------");
	}
}
