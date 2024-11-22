package test_app2;

import java.util.HashMap;
import java.util.Map.Entry;
//import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class M33 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("xyz", 10);
		map.put("abc", 11);
		map.put("hello", 110);
		map.put("test", 0);
		map.put("java", 1);
		map.put("btm", 101);
		map.put("test", 5);
		map.put("collection", 105);
		
		System.out.println(map);
		
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();
		map1.putAll(map);
		System.out.println(map1);
		
		//Set<Entry<String, Integer>> set1 = map.entrySet();
		TreeSet<Entry<String, Integer>> set2 = 
				new TreeSet<Entry<String,Integer>>((o1, o2) -> o1.getValue() - o2.getValue());
		set2.addAll(map.entrySet());
		System.out.println(set2);
	}
}
