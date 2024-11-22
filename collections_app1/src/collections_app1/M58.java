package collections_app1;

import java.util.HashMap;

public class M58 {
	public static void main(String[] args) {
		int[] nums = {5, 3, 0, 4, 1, 9};
		int target = 12;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				System.out.println(i + ", " + map.get(target - nums[i]));
				break;
			}
          map.put(nums[i], i);		
		}
		System.out.println(map);
	}
}
