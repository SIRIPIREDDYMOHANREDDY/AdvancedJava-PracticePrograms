package collections_app1;

import java.util.Arrays;

public class M81 {
	public static void main(String[] args) {
		M81 obj = new M81();
		String[] strs = {"abc", "cab", "bca", "bac"};
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i] + ":" + obj.sortedContent(strs[i]));
		}
	}
	private String sortedContent(String s1) {
		char[] chars = s1.toCharArray();
		Arrays.sort(chars);
		s1 = new String(chars);
		return s1;
	}
}
