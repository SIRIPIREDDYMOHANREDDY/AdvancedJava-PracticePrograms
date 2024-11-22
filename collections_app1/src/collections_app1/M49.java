package collections_app1;

import java.util.HashMap;
// Leetcode example
public class M49 {
	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String s1 = "abcabc";
		
		char c1;
		for(int i = 0; i < s1.length(); i++) {
			c1 = s1.charAt(i);
			map.put(c1, map.getOrDefault(c1, 0) + 1);
			if(map.get(c1) == 2) {
				System.out.println(c1);
				break;
			}
		}
	}
}
