package collections_app1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class M62 {
	public static void main(String[] args) {
		M62 obj = new M62();
		int[] nums1 = {1, 2, 3, 1, 2, 3, 4, 1, 2, 5};
		int[] nums2 = {1, 2, 5, 6, 4, 4, 4, 1, 2, 7};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums1.length; i++) {
			map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
		}
		// System.out.println(map)

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < nums2.length; i++) {
			if(map.containsKey(nums2[i])) {
				list.add(nums2[i]);
				if(map.get(nums2[i]) > 1) {
					map.put(nums2[i], map.get(nums2[i]) - 1);
				}
				else {
					map.remove(nums2[i]);
				}
			}
	   }
	   System.out.println(list);
    }
}
