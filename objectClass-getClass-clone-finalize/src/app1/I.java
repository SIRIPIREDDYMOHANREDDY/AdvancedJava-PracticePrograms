package app1;
class Z{
	int a;
}
public class I implements Cloneable{
	int b;
	Z z1;	
	public static void main(String[] args) throws Exception{
		I obj1 = new I();
		obj1.b = 10;
		obj1.z1 = new Z();
		obj1.z1.a = 40;		
		// Shallow Copy Operation
		I obj2 = (I) obj1.clone();
		//obj2.b = 20;
		System.out.println("stage1:" + obj1.b + ", " + obj1.z1.a);
		System.out.println("stage2:" + obj2.b + ", " + obj2.z1.a);
		obj2.z1.a = 140;
		System.out.println("stage1:" + obj1.b + ", " + obj1.z1.a);
		System.out.println("stage2:" + obj2.b + ", " + obj2.z1.a);
		obj1.z1.a = 190;
		System.out.println("stage1:" + obj1.b + ", " + obj1.z1.a);
		System.out.println("stage2:" + obj2.b + ", " + obj2.z1.a);
	}
}
