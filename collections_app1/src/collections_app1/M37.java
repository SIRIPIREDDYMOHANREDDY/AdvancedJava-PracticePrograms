package collections_app1;

import java.util.HashMap;

public class M37 {
	public static void main(String[] args) {
	HashMap map = new HashMap();
	map.put("name", "Kumar");
	map.put("age", 23);
	map.put("education", "BE");
	map.put("address", "Banglore");
	System.out.println(map.containsKey("name"));// containsKey method check whether the give key is available or not. It gives boolean value as output
	System.out.println(map.containsKey("firstName"));
	System.out.println(map.containsKey("weight"));
	System.out.println(map.containsKey("age"));
	}
}
// HashMap allows null as a key or null as a value
// HashTable not allowing null as a key or null as a value