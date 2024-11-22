package com.lara;
class H {
	int i;
	int j;
	int k;
	H(int i, int j, int k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}
	@Override
	public int hashCode() {
		int hash = Integer.toString(i).hashCode();
	    hash += Integer.toString(j).hashCode();
		hash += Integer.toString(k).hashCode();
		return hash;
	}
}

public class D9 {
	public static void main(String[] args) {
		H h1 = new H(10, 20, 30);
		H h2 = new H(10, 20, 30);
		H h3 = new H(20, 10, 30);
		H h4 = new H(10, 21, 30);
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h3.hashCode());
		System.out.println(h4.hashCode());
	}

}
