package collections_app1;

import java.util.ArrayList;
// Generic
// we mention data type inside '< >' brackets
public class M45 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("hello");
//		list.add(10);
//		list.add(true);
		System.out.println(list);
	}

}
