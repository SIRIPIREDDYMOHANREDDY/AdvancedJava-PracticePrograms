package collections_app1;

import java.util.HashSet;
import java.util.LinkedHashSet;
// LinkedHashSet avoid Duplicates and also maintain Order of addition
public class M29 {
	public static void main(String[] args) {
	LinkedHashSet set = new LinkedHashSet();
		System.out.println(set.add(10));
		System.out.println(set.add(10));
		System.out.println(set.add(20));
		System.out.println(set.add(20));
		System.out.println(set.add(30));
		System.out.println(set.add(30));
		System.out.println(set.add(1));
		System.out.println(set);
	}
}
