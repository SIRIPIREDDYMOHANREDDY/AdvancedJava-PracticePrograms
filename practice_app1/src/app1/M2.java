package app1;

public class M2 {
	public static void main(String[] args) {
		M2 obj = new M2();
		int[] nums = { 1, 1, 0, 1, 1, 1 };
		int[] nums1 = { 1, 0, 1, 1, 0, 1 };
		System.out.println(obj.findMaxConsecutiveOnes(nums));
		System.out.println(obj.findMaxConsecutiveOnes(nums1));

	}

	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {
				max = Math.max(max, count);
				count = 0;
			}
		}
		max = Math.max(max, count);
		return max;

	}
}
