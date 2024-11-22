package com.lara;
class D {
	int i;
}
public class D5 {
	public static void main(String[] args) {
		D d1 = new D();
		d1.i = 10;
		System.out.println(d1.hashCode());
	}
}
