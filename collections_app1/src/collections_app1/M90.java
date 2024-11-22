package collections_app1;

public class M90 {
	public static void main(String[] args) {
		String s = "leet**cod*e";
		int index;
		while((index = s.indexOf('*')) != -1) {
			s = s.substring(0, index - 1) + s.substring(index + 1);
		}
		System.out.println(s);
	}
}
