package test_app2;

public class M35 {
public static void main(String[] args) {
	int[] nums = {0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1};
	int p = 0;
	int zeroes = 0;
	int max = Integer.MIN_VALUE;
	int k=2;
	for(int i =0;i<nums.length;i++) {
		if(nums[i] ==0) {
			zeroes ++;
		}
		if(zeroes <=k) {
			max = Math.max(max, (i-p+1));
		}
		else {
			while(zeroes >k) {
				if(nums[p] ==0) {
					zeroes --;
				}
				p++;
			}
		}
	}
	System.out.println(max);
	
	
}
}
