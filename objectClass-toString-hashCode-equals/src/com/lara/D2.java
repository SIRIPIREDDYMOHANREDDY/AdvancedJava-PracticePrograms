package com.lara;
class A {
	int i;
	@Override
	public String toString() {
				return "i = " + i;
	}
	
}
public class D2 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 20;
		System.out.println(a1);
	}
}
