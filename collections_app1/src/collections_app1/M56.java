package collections_app1;

import java.util.HashMap;

public class M56 {
	public static void main(String[] args) {
		M56 obj = new M56();
		System.out.println(obj.firstUniqChar("abcabrtsud"));
		System.out.println(obj.firstUniqChar("pqrprabcdr"));
	}
	public int firstUniqChar(String s) {
		int index = -1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char c1;
        for(int i = 0; i < s.length(); i++) {
        	c1 = s.charAt(i);
//        	if(map.containsKey(c1)) {
//        		map.put(c1, map.get(c1) + 1);
//        	}
//        	else {
//        		map.put(c1, 1);
//        	}	
        	map.put(c1, map.getOrDefault(c1, 0) + 1);
        }
    	for(int i = 0; i < s.length(); i++) {
			c1 = s.charAt(i);
			if(map.get(c1) == 1) {
				index = i;
			    break;
			}
		}
        return index;
    }
}
