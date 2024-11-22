package collections_app1;

import java.util.HashMap;

public class M48 {
	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String s1 = "abcabc";
		
		char c1;
		for(int i = 0; i < s1.length(); i++) {
			c1 = s1.charAt(i);
			map.put(c1, map.getOrDefault(c1, 0) + 1);
		}
		System.out.println(map);
	}
}
// in case of map keys can't be duplicate, value can be duplicated 