package inner_classes;

public class M5 {
	int i;
	public static void main(String[] args) {
		M5 obj = new M5();
		System.out.println(obj.i);
	}
	
	static {
		M5 obj = new M5();
		System.out.println(obj.i);
	}
}
