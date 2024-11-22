package collections_app1;

import java.util.HashMap;
import java.util.Scanner;

public class M55 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1 = sc.nextLine();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char c1;
		for(int i = 0; i < s1.length(); i++) {
			c1 = s1.charAt(i);
			if(map.containsKey(c1)) {
				map.put(c1, map.get(c1) + 1);
			}
			else {
				map.put(c1, 1);
			}
			//map.put(c1, map.getOrDefault(c1, 0) + 1);
		}
		System.out.println(map);
		for(int i = 0; i < s1.length(); i++) {
			c1 = s1.charAt(i);
			if(map.get(c1) == 1) {
				System.out.println(i);
			    break;
			}
		}
	}
}
