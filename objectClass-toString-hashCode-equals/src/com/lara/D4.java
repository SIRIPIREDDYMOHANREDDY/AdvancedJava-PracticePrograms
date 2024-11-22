package com.lara;
//class A {
//	
//}
//class B {
//	
//}
class C {
	int i;
	int j;
	int k;
	public C(int i, int j, int k) {
		super();
		this.i = i;
		this.j = j;
		this.k = k;
	}
	@Override
	public String toString() {
		return "C [i=" + i + ", j=" + j + ", k=" + k + "]";
	}
	
}
public class D4 {
	public static void main(String[] args) {
		C c1 = new C(1, 34, 56);
		System.out.println(c1);
	}
}
