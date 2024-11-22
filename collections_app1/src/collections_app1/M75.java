package collections_app1;

import java.util.HashMap;

public class M75 {
	public static void main(String[] args) {
		M75 obj = new M75();
		String s = "abcdecholhabca";
		System.out.println(obj.lengthOfLongestSubstring(s));
		System.out.println(obj.lengthOfLongestSubstring("abcdabcfdgg"));
	}
	public int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char c1;
		int i = 0;
		int j = 0;
		int max = 0;
		for(; i < s.length(); i++) {
			c1 = s.charAt(i);
			if(map.containsKey(c1)) {
				max = Math.max(max, (i - j));
				while(map.containsKey(c1)) {
					map.remove(s.charAt(j));
					j++;
				}
			}
			map.put(c1, i);
		}
		max = Math.max(max, (i - j));
		return max;
	}
}
