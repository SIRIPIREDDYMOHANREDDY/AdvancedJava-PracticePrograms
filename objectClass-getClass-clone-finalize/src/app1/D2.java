package app1;

import java.lang.reflect.Field;

public class D2 {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("java.lang.Thread");
		Field[] fields = c1.getDeclaredFields();
		for(Field f1 : fields) {
			System.out.println(f1.getName());
		}
	}
}
