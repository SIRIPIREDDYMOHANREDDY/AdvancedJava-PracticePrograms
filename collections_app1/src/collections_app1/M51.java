package collections_app1;

import java.util.HashMap;
import java.util.Scanner;
//Leetcode example - Given a string 's' consisting of lowercase English letters, return the first letter to appear twice
public class M51 {
	public static void main(String[] args) {
		M51 obj = new M51();
		char repeatedChar1 = obj.repeatedCharacter("abcdabcd");
		System.out.println(repeatedChar1);
	}
	public char repeatedCharacter(String s) {
        char c1 = s.charAt(0);
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
        	c1 = s.charAt(i);
        	map.put(c1, map.getOrDefault(c1, 0) + 1);
        	if(map.get(c1) == 2) {
        		break;
        	}
        }
        return c1;
    }
}
