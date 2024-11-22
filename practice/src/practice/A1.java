package practice;

import java.util.HashMap;

public class A1 {
	public static void main(String[] args) {
		char c1 = repeatedCharacter("abbideabi") ;
	}
	public static char repeatedCharacter(String s) {
		char c1=0;
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		for(int i = 0;i<s.length();i++) {
			c1 = s.charAt(i);
			map.put(c1, map.getOrDefault(c1, 0) +1);
			if(map.get(c1)==2) {
				break;
			}
		}
System.out.println(c1);
		return c1	;

	}

}
