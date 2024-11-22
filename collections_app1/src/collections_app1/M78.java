package collections_app1;

import java.util.HashMap;

public class M78 {
	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1};
		int counter = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				counter++;
			}
			else {
				System.out.println(counter);
				counter = 0;
			}
		}
		System.out.println(counter);
    } 
}
