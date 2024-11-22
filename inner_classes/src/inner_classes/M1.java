package inner_classes;

public class M1 {
	static int i;
	M1(){
		i = 1;
	}
	public static void main(String[] args) {
		i = 3;
	}
	static {
		i = 4;
	}
	void test() {
		i = 56;
	}
	{
		i = 4555;
	}
}
