package collections_app1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class M83 {
	public static void main(String[] args) {
		M83 obj = new M83();
		//String[] strs = {"cab", "bca", "bac", "cba"};
		//String[] strs = {"bac", "cba", "care", "race"};
		String[] strs = {"eat", "cab", "race", "bca", "care", "tea"};
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		String str, sortedStr;
		for(int i = 0; i < strs.length; i++) {
			str = strs[i];
			sortedStr = obj.sortedContent(str);
			if(map.containsKey(sortedStr)) {
				map.get(sortedStr).add(str);
			}
			else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(str);
				map.put(sortedStr, list);
			}
		}
		System.out.println(map.values());
	}
	private String sortedContent(String s1) {
		char[] chars = s1.toCharArray();
		Arrays.sort(chars);
		s1 = new String(chars);
		return s1;
	}
}
