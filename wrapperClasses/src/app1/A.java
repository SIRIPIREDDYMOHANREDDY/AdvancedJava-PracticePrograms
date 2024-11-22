package app1;

public class A {
	public static void main(String[] args) {
		Integer obj1 = Integer.valueOf(10);  //  boxing
		int i = 20;
		Integer obj2 = Integer.valueOf(i);   //   boxing
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(i);
	}
}
