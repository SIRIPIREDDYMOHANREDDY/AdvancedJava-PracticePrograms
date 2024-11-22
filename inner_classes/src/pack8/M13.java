package pack8;

public class M13 {
	public static void main(String[] args) {
		E e1 = () -> {
			System.out.println("from lambda-exp-stmt1");
			System.out.println("from lambda-exp-stmt2");
			System.out.println("from lambda-exp-stmt3");
			System.out.println("from lambda-exp-stmt4");
			System.out.println("from lambda-exp-stmt5");
		};
		
		e1.test1();
	}
}
