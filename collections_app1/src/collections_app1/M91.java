package collections_app1;

import java.util.ArrayList;
import java.util.LinkedList;

public class M91 {
	public static void main(String[] args) {
		M91 obj = new M91();
		System.out.println(obj.removeStars("leet***cod**e"));
		System.out.println(obj.removeStars("leet****cod**e"));
		System.out.println(obj.removeStars("leet****cod***e"));
		System.out.println(obj.removeStars("leet****co*de***"));
		System.out.println(obj.removeStars("leet****co*de***"));
	}
	public String removeStars(String s) {
		char c1;
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i = 0; i < s.length(); i++) {
			c1 = s.charAt(i);
			if(c1 == '*') {
				list.remove(list.size() - 1);
				continue;
			}
			list.add(c1);
		}
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		return sb.toString();
    }
}
