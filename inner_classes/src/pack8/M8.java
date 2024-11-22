package pack8;

public class M8 {
	public static void main(String[] args) {
		C c1 = new C() {
			
		};
		c1.test();
		System.out.println("-------------");
		C c2 = new C(20) {
			
		};
		c2.test();
		System.out.println("-------------");
		C c3 = new C(20, 40) {
			{
				System.out.println("IIB-AIC");
			}
		};
		c3.test();
		System.out.println("-------------");
	}
}