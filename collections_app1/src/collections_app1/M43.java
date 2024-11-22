package collections_app1;

import java.util.TreeMap;
// TreeMap allows auto sorting based on keys
// all keys are same type then only sorting is success.
public class M43 {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put("hello", 10);
		map.put("xyz", 20);
		map.put("abc", 30);
		map.put("test", 40);
		map.put("java", 50);
		map.put("amc", 60);
		System.out.println(map);
	}
}
