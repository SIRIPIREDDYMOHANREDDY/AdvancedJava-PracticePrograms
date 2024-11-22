package collections_app1;

public class M80 {
	public static void main(String[] args) {
		M80 obj = new M80();
		int[] nums1 = {1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1};
		System.out.println(obj.findMaxConsecutiveOnes(nums1));
		int[] nums2 = {1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1};
		System.out.println(obj.findMaxConsecutiveOnes(nums2));
		int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		System.out.println(obj.findMaxConsecutiveOnes(nums3));
	}
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int counter = 0;
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
		return max; 
    }
}
