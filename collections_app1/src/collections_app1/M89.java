package collections_app1;
//remove '*'
public class M89 {
	public static void main(String[] args) {
		String s = "leet**cod*e";
		int index;
		while((index = s.indexOf('*')) != -1) {
			s = s.substring(0, index) + s.substring(index + 1);
		}
		System.out.println(s);
	}
}
