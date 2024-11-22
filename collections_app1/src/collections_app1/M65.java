package collections_app1;

import java.util.HashMap;
import java.util.Set;

public class M65 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 12);
		map.put("xyz", 121);
		map.put("hello", 212);
		map.put("test", 122);
		map.put("key1", 132);
		map.put("k2", 312);
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		for(String key : keys) {
			System.out.println(key);
		}
	}
}
