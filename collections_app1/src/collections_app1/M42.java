package collections_app1;

import java.util.LinkedHashMap;
// LinkesHashMap - key can be any data type
// value can be any data type
// it maintain order
public class M42 {
	public static void main(String[] args) {
		LinkedHashMap map = new LinkedHashMap();
		map.put("abc", 1000);
		map.put("xyz", 1000);
		map.put(30, 't');
		map.put(false, 'y');
		map.put(true, 4.6);
		map.put("test", true);
		System.out.println(map);
	}
}
