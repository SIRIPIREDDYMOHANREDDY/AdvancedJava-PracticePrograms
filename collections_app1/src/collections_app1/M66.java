package collections_app1;

import java.util.Collection;
import java.util.HashMap;


public class M66 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abc", 12);
		map.put("xyz", 121);
		map.put("hello", 212);
		map.put("test", 122);
		map.put("key1", 132);
		map.put("k2", 312);
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		for(Integer value : values) {
			System.out.println(value);
		}
	}
}
