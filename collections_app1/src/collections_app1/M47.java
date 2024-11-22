package collections_app1;

import java.util.HashMap;

public class M47 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "abc");
		map.put(200, "abc");
		map.put(500, "test");
//		map.put("test", 4.5);
//		map.put("hello", 3444);
		System.out.println(map);
	}
}