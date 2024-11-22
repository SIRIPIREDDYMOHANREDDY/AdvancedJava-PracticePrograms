package com.lara;
class F {
	int i;
	
	@Override
	public int hashCode() {
		return Integer.toString(i).hashCode(); //here converting int to string then we called hashCode 
	}
}
public class D7 {
	public static void main(String[] args) {
		F f1 = new F();
		f1.i = 10;
		System.out.println(f1.hashCode());
		F f2 = new F();
		f2.i = 10;
		System.out.println(f2.hashCode());
		F f3 = new F();
		f3.i = 20;
		System.out.println(f3.hashCode());
	}
}
