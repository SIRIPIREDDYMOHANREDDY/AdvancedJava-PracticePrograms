package pack7;

public class M4 {
	public static void main(String[] args) {
		int i = 10;
		final int j = 20;
		
		class A{
			void test() {
				System.out.println(i);
				System.out.println(j);
			}
		}
		
		A a1 = new A();
		a1.test();
		
//		j = 20;
//   	i = 100;
		
		a1.test();
	}
}
