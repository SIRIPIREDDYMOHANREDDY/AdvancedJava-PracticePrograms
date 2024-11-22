package collections_app1;

import java.util.Arrays;

public class M77 {
	public static void main(String[] args) {
		M77 obj = new M77();
//		String s = "anagram";
//		String t = "nagaram";
//		System.out.println(obj.isAnagram(s, t));
		System.out.println(obj.isAnagram("anagram", "nagaram"));
		System.out.println(obj.isAnagram("race", "care"));
		System.out.println(obj.isAnagram("abc", "bca"));
		System.out.println(obj.isAnagram("abc", "rca"));
	}
	public boolean isAnagram(String s, String t) {
        char[] chars1 = s.toCharArray();
        Arrays.sort(chars1);
        s = new String(chars1); 
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);
        t = new String(chars2);        
        return s.equals(t);
    }
}
