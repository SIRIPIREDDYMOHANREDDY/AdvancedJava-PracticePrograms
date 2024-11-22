package collections_app1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class M85 {
	public static void main(String[] args) {
		M85 obj = new M85();
		String[] strs = {"eat", "cab", "race", "bca", "care", "tea"};
		System.out.println(obj.groupAnagrams(strs));
	}
	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		String str, sortedStr;
		for(int i = 0; i < strs.length; i++) {
			str = strs[i];
			sortedStr = sortedContent(str);
			if(map.containsKey(sortedStr)) {
				map.get(sortedStr).add(str);
			}
			else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(str);
				map.put(sortedStr, list);
			}
		}
		List<List<String>> list = new ArrayList<List<String>>(map.values());
		return list;
	}
	private String sortedContent(String s1) {
		char[] chars = s1.toCharArray();
		Arrays.sort(chars);
		s1 = new String(chars);
		return s1;
	}
}
