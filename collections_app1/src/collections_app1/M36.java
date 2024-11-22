package collections_app1;

import java.util.HashMap;

public class M36 {
	public static void main(String[] args) {
	HashMap map = new HashMap();
	map.put("name", "Kumar");
	map.put("age", 23);
	map.put("education", "BE");
	map.put("address", "Banglore");
	System.out.println(map.getOrDefault("firstName", "No value to firstName"));// getOrDefault give second argument when key is not available
	System.out.println(map.getOrDefault("nameame", "No value to name"));
	System.out.println(map.getOrDefault("age", "No value to age"));
   }
}
