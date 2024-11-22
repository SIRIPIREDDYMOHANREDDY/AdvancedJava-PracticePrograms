package app1;

import java.lang.reflect.Method;
class A {
	public void test1() {	
	}
	public void test2() {	
	}
	public void test3() {	
	}
}
public class D3 {
	public static void main(String[] args) throws Exception{
		Class c1 = Class.forName("app2.A");
		Method[] methods = c1.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
	}
}
