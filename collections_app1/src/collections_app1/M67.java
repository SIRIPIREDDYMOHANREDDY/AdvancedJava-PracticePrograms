package collections_app1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class M67 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 12);
		map.put("xyz", 121);
		map.put("hello", 212);
		map.put("test", 122);
		map.put("key1", 132);
		map.put("k2", 312);
		Set<Entry<String, Integer>> entries = map.entrySet();
		
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry);
		}
	}
}
