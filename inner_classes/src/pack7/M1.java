package pack7;
// inside main method we develop a class and this is called as local inner class.
public class M1 {
	public static void main(String[] args) {
		class A {
			void test() {
				System.out.println("from test");
			}
		}
		System.out.println("done");
	}
}
