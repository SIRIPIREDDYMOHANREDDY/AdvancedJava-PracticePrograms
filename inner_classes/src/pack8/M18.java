package pack8;
interface I{
	int sum(int i, int j);
}
public class M18 {
	public static void main(String[] args) {
		I obj1 = (p, q) -> p + q;
		I obj2 = (x, y) -> {   
			System.out.println("from test");
			return x + y;
		};
		System.out.println(obj1.sum(10, 20));
		System.out.println(obj1.sum(120, 220));
	}
}
