package collections_app1;

import java.util.HashMap;

public class M57 {
	public static void main(String[] args) {
		int[] nums = {5, 3, 0, 4, 1, 9};
		int target = 12;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
//		for(int i = 0; i < nums.length; i++) {
//			int a = target - nums[i];
//			if(map.containsKey(a)) {
//				System.out.println(i + ", " + map.get(a));
//				break;
//			}
//		}
		//System.out.println(map);
	}
}
// in side Hashmap keys are array elements