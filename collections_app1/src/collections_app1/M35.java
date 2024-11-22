package collections_app1;

import java.util.HashMap;

public class M35 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("name", "Kumar");
		map.put("age", 23);
		map.put("education", "BE");
		map.put("address", "Banglore");
		System.out.println(map.get("firstName"));// if specified key not available while calling get() method we get null
	}
}
