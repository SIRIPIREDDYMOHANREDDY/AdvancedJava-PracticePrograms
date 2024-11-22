package app1;

import java.lang.reflect.Method;

public class D1 {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("java.lang.String");
		Method[] methods = c1.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method.getName());
		}
	}

}
