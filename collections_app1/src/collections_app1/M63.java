package collections_app1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class M63 {
	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums1.length; i++) {
			map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
		}
		
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
		int[] results = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			results[i] = list.get(i);
		}
	   return results;
    }
	public static void main(String[] args) {
		M63 obj = new M63();
		int[] nums1 = {1, 2, 3, 1, 2, 3, 4, 1, 2, 5};
		int[] nums2 = {1, 2, 5, 6, 4, 4, 4, 1, 2, 7};
		int[] results = obj.intersect(nums1, nums2);
		System.out.println(Arrays.toString(results));
    }
}