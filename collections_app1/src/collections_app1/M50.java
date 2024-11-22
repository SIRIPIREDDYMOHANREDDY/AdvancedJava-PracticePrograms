package collections_app1;

import java.util.HashMap;
import java.util.Scanner;
// Leetcode example - Given a string 's' consisting of lowercase English letters, return the first letter to appear twice
public class M50 {
	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		char c1;
		for(int i = 0; i < s1.length(); i++) {
			c1 = s1.charAt(i);
			map.put(c1, map.getOrDefault(c1, 0) + 1);
			if(map.get(c1) == 2) {
				System.out.println("First repeating Character is : "+ c1);
				break;
			}
		}
	}
}
