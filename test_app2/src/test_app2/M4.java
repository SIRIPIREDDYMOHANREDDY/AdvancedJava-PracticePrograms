package test_app2;

import java.util.ArrayList;
import java.util.Collections;

public class M4 {
	static class A implements Comparable{
		int i;
		A(int i) { 
			this.i = i;
		}
		@Override
		public String toString() {
			return "i =" + i;
		}
		@Override
		public int compareTo(Object o) {
			System.out.println("compare to");
			return i - ((A) o).i;
		}
	}
	public static void main(String[] args) {
		A a1 = new A(90);
		A a2 = new A(20);
		A a3 = new A(10);
		A a4 = new A(40);
		A a5 = new A(30);
		ArrayList<A> list = new ArrayList<A>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
