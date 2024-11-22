package com.lara;
class J {
	int p;
}
public class D11 {
	public static void main(String[] args) {
	J j1 = new J();
	J j2 = j1;
	j2.p = 10;
	
	J j3 = new J();
	j3.p = 10;
	
	System.out.println(j1 == j2);
	System.out.println(j1 == j3);
	System.out.println(j2 == j3);
	System.out.println("----------");
	System.out.println(j1.equals(j2));
	System.out.println(j1.equals(j3));
	System.out.println(j2.equals(j3));
	}
}