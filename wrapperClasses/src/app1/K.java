package app1;

public class K {
	public static void main(String[] args) {
		Integer obj1 = Integer.valueOf(10);
		int i = obj1; // int i = obj1.intValue();  auto unboxing
		
		Double obj2 = Double.valueOf(1.5);
		double j = obj2;  // double j = obj2.doubleValue(); auto unboxing
		
		System.out.println("done");
	}
}
