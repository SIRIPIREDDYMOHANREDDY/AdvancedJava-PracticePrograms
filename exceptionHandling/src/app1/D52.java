package app1;

public class D52 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			test1();
		}
		catch(ClassNotFoundException ex) {
			System.out.println(ex);
		}
		System.out.println(2);
	}
	static void test1() throws ClassNotFoundException{
		System.out.println(3);
		Class.forName(""); 
		System.out.println(4);
	}
}
