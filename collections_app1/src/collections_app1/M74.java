package collections_app1;

import java.util.HashMap;

public class M74 {
	public static void main(String[] args) {
		String s1 = "abcdecholhabca";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char c1;
		int i = 0;
		int j = 0;
		int max = 0;
		for(; i < s1.length(); i++) {
			c1 = s1.charAt(i);
			if(map.containsKey(c1)) {
				max = Math.max(max, (i - j));
				while(map.containsKey(c1)) {
					map.remove(s1.charAt(j));
					j++;
				}
			}
			map.put(c1, i);
		}
		max = Math.max(max, (i - j));
		System.out.println(max);
	}
}
