package collections_app1;

import java.util.HashSet;
// HashSet main feature is Avoid Duplicates
// HashSet doesn't maintain order of addition
public class M28 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println(set.add(100));
		System.out.println(set.add(100));
		System.out.println(set.add(200));
		System.out.println(set.add(200));
		System.out.println(set.add(400));
		System.out.println(set.add(400));
		System.out.println(set.add(600));
		System.out.println(set.add(100));
		System.out.println(set.add(200));
		System.out.println(set);
	}
}
