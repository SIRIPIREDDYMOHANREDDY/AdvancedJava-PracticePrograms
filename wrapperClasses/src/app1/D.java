package app1;

public class D {
	public static void main(String[] args) {
		int i = 10;
		Integer obj1 = Integer.valueOf(i); // boxing
		char c1 = 'a';
		Character obj2 = Character.valueOf(c1);  // boxing
		int j = obj1.intValue();    // unboxing
		char c2 = obj2.charValue(); // unboxing
		System.out.println(i);
		System.out.println(obj1);
		System.out.println(c1);
		System.out.println(j);
		System.out.println(obj2);
		System.out.println(c2);
	}
}
