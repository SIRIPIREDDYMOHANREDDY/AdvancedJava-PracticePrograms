package com.lara;
class L {
	int i;
	int j;
	L(int i, int j) {
		this.i = i;
		this.j = j;
	}
	@Override
	public boolean equals(Object obj) {
		L ref = (L) obj;
		boolean flag = (i == ref.i && j == ref.j);
		return flag;
	}
}
public class D13 {
	public static void main(String[] args) {
		L obj1 = new L(10, 20);
		L obj2 = new L(10, 20);
		L obj3 = new L(10, 19);
		L obj4 = new L(20, 19);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj2.equals(obj3));
		System.out.println(obj1.equals(obj4));
	}

}
