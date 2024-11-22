package collections_app1;

import java.util.HashMap;

public class M34 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("name", "Kumar");
		map.put("age", 23);
		map.put("education", "BE");
		map.put("address", "Banglore");
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("education"));
		System.out.println(map.get("address"));
	}
}
