package com.lara;
class K {
	int i; 
	@Override
	public boolean equals(Object obj) {
		K ref = (K) obj;
		return this.i == ref.i;
	}
}
public class D12 {
	public static void main(String[] args) {
		K k1 = new K();
		k1.i = 10;
		
		K k2 = new K();
		k2.i = 10;
		
		K k3 = new K();
		k3.i = 20;
		
		System.out.println(k1.equals(k2));
		System.out.println(k1.equals(k3));
		System.out.println(k2.equals(k3));
	}
}
