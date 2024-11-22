package collections_app1;

import java.util.TreeSet;
// TreeSet avoid Duplicates and also achieve sorting
public class M31 {
	public static void main(String[] args) {
	TreeSet set = new TreeSet();
	set.add(10);
	set.add(10);
	set.add(40);
	set.add(40);
	set.add(1);
	set.add(1);
	set.add(0);
	set.add(0);
	set.add(4);
	set.add(14);
	System.out.println(set);
   }
}
