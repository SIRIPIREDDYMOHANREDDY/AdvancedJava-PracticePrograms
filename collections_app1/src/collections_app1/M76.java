package collections_app1;

import java.util.Arrays;

public class M76 {
	public static void main(String[] args) {
		
//		String s1 = "abc";
//		String s2 = "abc";
//		System.out.println(s1.equals(s2));
		
//		String s1 = "hello";
//		char[] chars = s1.toCharArray();
//		for(int i = 0; i < s1.length(); i++) {
//			System.out.println(chars[i]);
//		}
		
//		String s1 = "hello";
//		char[] chars = s1.toCharArray();
//		Arrays.sort(chars);
//		for(int i = 0; i < s1.length(); i++) {
//			System.out.println(chars[i]);
//		}
		
//		String s1 = "hello";
//		char[] chars = s1.toCharArray();
//		Arrays.sort(chars);
//		s1 = new String(chars);
//		System.out.println(s1);
		
		String s1 = "anagram";
		char[] chars1 = s1.toCharArray();
		Arrays.sort(chars1);
		s1 = new String(chars1);
//		System.out.println(s1);
		
		String s2 = "nagaram";
		char[] chars2 = s2.toCharArray();
		Arrays.sort(chars2);
		s2 = new String(chars2);
//		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
	}
}
