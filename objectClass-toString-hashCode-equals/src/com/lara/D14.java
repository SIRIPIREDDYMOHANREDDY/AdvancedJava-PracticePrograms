package com.lara;

import java.util.HashSet;

class M {
	int i;
	int j;
	
	M(int i, int j) {
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(i = " + i + ", j = " + j + " )";
	}
	
	@Override
	public int hashCode() {
		int hash = Integer.toString(i).hashCode() + Integer.toString(j).hashCode();
		System.out.println("hashCode for" + this + "is" + hash);
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = (obj instanceof M) && (i == ((M) obj).i) && (j == ((M) obj).j);
		System.out.println("equality b/w" + this + "and" + obj + "is" + flag);
		return flag;
	}
	
}
public class D14 {
	public static void main(String[] args) {
	M m1 = new M(10, 20);
	M m2 = new M(20, 40);
	M m3 = new M(20, 10);
	M m4 = new M(40, 20);
	M m5 = new M(40, 40);
	M m6 = new M(30, 10);
	M m7 = new M(10, 30);
	M m8 = new M(10, 50);
	M m9 = new M(50, 30);
	M m10 = new M(10, 50);
	
	HashSet<M> set = new HashSet<M>();
	System.out.println("adding status of(m1) " + m1 +"is " + set.add(m1));
	System.out.println("content int the set after adding m1 : "+ set);
	System.out.println("adding status of(m2) " + m2 +"is " + set.add(m2));
	System.out.println("content int the set after adding m2 : "+ set);
	System.out.println("adding status of(m3) " + m3 +"is " + set.add(m3));
	System.out.println("content int the set after adding m3 : "+ set);
	System.out.println("adding status of(m4) " + m4 +"is " + set.add(m4));
	System.out.println("content int the set after adding m4 : "+ set);
	System.out.println("adding status of(m5) " + m5 +"is " + set.add(m5));
	System.out.println("content int the set after adding m5 : "+ set);
	System.out.println("adding status of(m6) " + m6 +"is " + set.add(m6));
	System.out.println("content int the set after adding m6 : "+ set);
	System.out.println("adding status of(m7) " + m7 +"is " + set.add(m7));
	System.out.println("content int the set after adding m7 : "+ set);
	System.out.println("adding status of(m8) " + m8 +"is " + set.add(m8));
	System.out.println("content int the set after adding m8 : "+ set);
	System.out.println("adding status of(m9) " + m9 +"is " + set.add(m9));
	System.out.println("content int the set after adding m9 : "+ set);
	System.out.println("adding status of(m10) " + m10 +"is " + set.add(m10));
	System.out.println("content int the set after adding m10 : "+ set);
   }
}
