package com.lara;
//class A {
//	
//}

class B {
	int i;
	int j;
	int k;
	public B(int i, int j, int k) {
		super();
		this.i = i;
		this.j = j;
		this.k = k;
	}
	@Override
	public String toString() {
		return "i = " + i + ", j = " + j + ", k =" + k;
	}
}
public class D3 {
    public static void main(String[] args) {
		B b1 = new B(10, 20, 30);
		System.out.println(b1);
	}
}
