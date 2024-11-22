package collections_app1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class M59 {
	public static void main(String[] args) {
		M59 obj = new M59();
		Scanner sc = new Scanner(System.in);
		int[] nums = {3, 2, 5, 6, 4, 1, 0};
		System.out.println("Enter target");
		int target = sc.nextInt();
		System.out.println(Arrays.toString(obj.twoSum(nums, target)));
	}
	 public int[] twoSum(int[] nums, int target) {
	     int[] result = {-1, -1};
	     
	     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	     for(int i = 0; i < nums.length; i++) {
	    	 if(map.containsKey(target - nums[i])) {
	    		 result[0] = i;
	    		 result[1] = map.get(target - nums[i]);
	    		 break;
	    	 }
	    	 map.put(nums[i], i);
	     }
	     return result;
	 }
}
