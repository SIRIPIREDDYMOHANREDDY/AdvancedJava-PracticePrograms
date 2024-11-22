package test_app1;

import java.util.Arrays;

public class M13 {
	public static void main(String[] args) {
		final int[] nums = {10, 20, 30};
		nums[1] = 5247;
		System.out.println(Arrays.toString(nums));
	//	nums = null;
		
		final int[] a = new int[3];
		a[0] = 20;
		a[0] = 120;
	//	a = new int[3];
		
		a[1] = 4555;
		a[1] = 14555;
	}
}
// here array is final but index is not final