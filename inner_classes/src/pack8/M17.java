package pack8;
interface H{
	int test();
}
public class M17 {
	public static void main(String[] args) {
		H obj1 = () -> 2000;
		
		System.out.println(obj1.test());
		
		System.out.println("------------");
		
		H obj2 = () -> {;
			System.out.println("i am from test");
			return 4000;
		};
		
		System.out.println(obj2.test());
	}
}
// if multiple statements are there, then only return keyword is required