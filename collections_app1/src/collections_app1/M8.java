package collections_app1;

import java.util.ArrayList;

public class M8 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(910);
		list.add(190);
		list.add(901);
		list.add(290);
		list.add(920);
		list.add(902);
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
	}
}