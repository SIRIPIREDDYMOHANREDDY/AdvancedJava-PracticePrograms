package collections_app1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class M61 {
	public static void main(String[] args) {
		M61 obj = new M61();
		int[] nums1 = {3, 4, 5, 6, 7, 8, 2, 3, 4, 5};
		int[] nums2 = {3, 4, 2, 3, 4, 5, 8, 9, 1, 10};
		int[] commonElements = obj.intersection(nums1, nums2);
		System.out.println(Arrays.toString(commonElements));
	}
	public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums1.length; i++) {
        	map.put(nums1[i], 1);
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums2.length; i++) {
        	if(map.containsKey(nums2[i])) {
        		list.add(nums2[i]);
        		map.remove(nums2[i]);
        	}
        }
        int[] results = new int[list.size()];
        for(int i = 0; i < results.length; i++) {
        	results[i] = list.get(i);
        }
        return results;
    }
}
