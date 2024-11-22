package inner_classes;

public class M7 {
	int i;
	
	@Override
	public String toString() {
		String s1 = "state :" + i;
		s1 += " and address is :" + super.toString();
		return s1;
	}
	
	public static void main(String[] args) {
		M7 obj = new M7();
		System.out.println(obj);
	}
}
