package com.lara;
class E {
	int i;
}
public class D6 {
	public static void main(String[] args) {
		E e1 = new E();
		e1.i = 10;
		
		E e2 = new E();
		e2.i = 10;
		
		E e3 = new E();
		e3.i = 20;
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	} 
}
