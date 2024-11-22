package garbageCollection;

public class S1 {
	
	public void finalize() {
	System.out.println("Finalize method is called");	
	}
	
	public static void main(String[] args) {
//		System.gc();
//		Runtime.getRuntime().gc();
		//UNUSED OBJECTS
		//UN REFERENCED OBJECTS
		//ANONUMOUS OBJECTS
		
		
		S1  s = new S1();
		S1  s1 = new S1();
		S1  s2 = new S1();
		
		s2 = null;
		
		s1 =s2;
		
		new S1();
		
		System.gc();
		
		
		
		
	}

}
