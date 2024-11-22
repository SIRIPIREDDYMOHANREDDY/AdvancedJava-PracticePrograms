package test_app2;

public class M36 {
public static void main(String[] args) {
	M36  obj = new M36();
	int[] nums = {0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1};
	int k=2;
	System.out.println(obj.longestOnes(nums, k));
	
} 
public int longestOnes(int[] nums, int k) {
int p = 0;
int zeroes = 0;
int max = 0;
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
return max;


}
}
