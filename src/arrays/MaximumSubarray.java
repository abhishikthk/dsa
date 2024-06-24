package arrays;

import java.util.Arrays;

public class MaximumSubarray {

	public static void main(String[] args) {
		//{5,4,-1,7,8}
		// -1, 4, 5, 7, 8
		/*
		 * cs = 8
		 * 
		 */
		MaximumSubarray obj = new MaximumSubarray();
		System.out.println(obj.maxSubArray(new int[] {5,4,-1,7,8}));
	}
	
	public int maxSubArray(int[] nums) {
		Arrays.sort(nums);
		int currentSum = 0;
		int nextSum = nums[nums.length-1];
		for(int i = nums.length-1; i >= 0; i--) {
			currentSum += nums[i];
			nextSum = currentSum + nums[i-1];
			if(nextSum<currentSum) {
				return currentSum;
			}
		}
		
		return -1;
	}
}
