package app1;

public class M {
	static int test1() {
		Integer obj = Integer.valueOf(1);
		return obj;
	}
	
	public static void main(String[] args) {
		int i = test1();
		Integer j = test1();
		System.out.println("done");
	}
}
