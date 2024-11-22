package collections_app1;

//import java.util.HashMap;

public class M52 {
	public static void main(String[] args) {
		String s1 = "abcabcabcdefabcabc";
		//HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char c1;
		for(int i = 0; i < s1.length(); i++) {
			c1 = s1.charAt(i);
			System.out.println(c1);
		}
	}
}
