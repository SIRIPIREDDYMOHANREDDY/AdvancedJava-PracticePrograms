package collections_app1;
// remove '*'
public class M88 {
	public static void main(String[] args) {
		String s = "leet**cod*e";
		int index = s.indexOf('*');
		while(index != -1) {
			s = s.substring(0, index) + s.substring(index + 1);
			index = s.indexOf('*');
		}
		System.out.println(s);
	}
}
