package app1;

public class app46 {
	public static void main(String[] args) {
//		Class c1 = Class.forName("java.lang.String");
		try {
			Class c1 = Class.forName("java.lang.String");
		}
		catch(ClassNotFoundException ex) {
			System.out.println(ex);
		}
		System.out.println("done");
	}
}
