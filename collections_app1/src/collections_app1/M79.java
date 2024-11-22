package collections_app1;

public class M79 {
	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1};
		int counter = 0;
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				counter++;
			}
			else {
				max = Math.max(max, counter);
				counter = 0;
			}
		}
		max = Math.max(max, counter);
		System.out.println(max);
    }
}
