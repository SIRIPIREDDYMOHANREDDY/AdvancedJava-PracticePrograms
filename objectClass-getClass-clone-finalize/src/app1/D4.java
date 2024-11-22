package app1;

import java.lang.reflect.Method;

class B{
	public void test() {
		System.out.println("from test");
	}
}
public class D4 {
	public static void main(String[] args) throws Exception{
	B b1 = new B();
	b1.test();
	System.out.println("----------");
	Class c1 = b1.getClass();
	System.out.println(c1);
	Method[] methods = c1.getDeclaredMethods();
	for(Method method : methods) {
		System.out.println(method.getName());
	}
	System.out.println("----------");
	Object obj = c1.newInstance();
	System.out.println(obj);
	((B) obj).test();
  }
}
