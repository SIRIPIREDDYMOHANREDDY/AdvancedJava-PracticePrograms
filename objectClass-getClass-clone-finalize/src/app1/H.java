package app1;

public class H implements Cloneable{
	int i;
	
	public static void main(String[] args) throws CloneNotSupportedException{
		H obj1 = new H();
		obj1.i = 10;
		// Deep Copy Operation
		H obj2 = (H) obj1.clone();
		System.out.println("a:" + obj1.i);
		System.out.println("a:" + obj2.i);
		obj1.i = 20;
		System.out.println("c:" + obj1.i);
		System.out.println("d:" + obj2.i);
		obj2.i = 30;
		System.out.println("e:" + obj1.i);
		System.out.println("f:" + obj2.i);
	}
}
