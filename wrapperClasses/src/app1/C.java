package app1;

public class C {
	public static void main(String[] args) {
		Integer obj1 = Integer.valueOf(90);  // boxing
		Double obj2 = Double.valueOf(3.4);   // boxing
		
		int i = obj1.intValue();          // unboxing
		double j = obj2.doubleValue();    // unboxing
		
		System.out.println(i);
		System.out.println(j);
	}

}
