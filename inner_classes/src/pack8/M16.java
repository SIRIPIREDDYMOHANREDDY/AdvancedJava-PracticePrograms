package pack8;
interface G{
	void test(int i, int j);
}

public class M16 {
	public static void main(String[] args) {
		G g1 = (i, j) -> {
			System.out.println("from test1:" + i);
			System.out.println("from test1:" + j);
		};
		
		g1.test(10, 20);
	}
}
