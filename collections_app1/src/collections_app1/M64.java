package collections_app1;

import java.util.HashMap;

public class M64 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 12);
		map.put("xyz", 121);
		map.put("hello", 212);
		map.put("test", 122);
		map.put("key1", 12);
		map.put("k2", 12);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
}
