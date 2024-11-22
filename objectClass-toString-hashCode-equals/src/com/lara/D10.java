package com.lara;
class I {
	int a;
}
public class D10 {
	public static void main(String[] args) {
		I obj1 = new I();
		obj1.a = 10;
		
		I obj2 = new I();
		obj2.a = 10;
		
		I obj3 = new I();
		obj3.a = 20;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1 == obj3);
		System.out.println(obj2 == obj3);
		System.out.println("------------");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj2.equals(obj3));
	}
}
