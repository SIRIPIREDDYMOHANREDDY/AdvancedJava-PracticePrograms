package collections_app1;

import java.util.ArrayList;
import java.util.HashMap;

public class M60 {
	public static void main(String[] args) {
		int[] nums1 = {2, 3, 4, 2, 4, 6, 3, 6, 2, 3};
		int[] nums2 = {4, 2, 4, 2, 3, 3, 2, 4, 5, 7};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums1.length; i++) {
			map.put(nums1[i], 1);
		}
		//System.out.println(map);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < nums2.length; i++) {
			if(map.containsKey(nums2[i])) {
				list.add(nums2[i]);
				map.remove(nums2[i]);
			}
		}
		System.out.println(list);
	}
}
