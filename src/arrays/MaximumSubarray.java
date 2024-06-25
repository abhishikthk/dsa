package arrays;

public class MaximumSubarray {

	public static void main(String[] args) {
		MaximumSubarray obj = new MaximumSubarray();
		System.out.println("---> Brute Force");
		System.out.println(obj.maxSubArrayBrute(new int[] { 5, 4, -1, 7, 8 }));
		System.out.println(obj.maxSubArrayBrute(new int[] { -2, -3, 4, -1, -2, 1, 5, -3 }));
		System.out.println("---> Brute Force: Simplified");
		System.out.println(obj.maxSubArrayBruteBetter(new int[] { 5, 4, -1, 7, 8 }));
		System.out.println(obj.maxSubArrayBruteBetter(new int[] { -2, -3, 4, -1, -2, 1, 5, -3 }));
		System.out.println("---> Kadane's Algo");
		System.out.println(obj.maxSubArrayKadane(new int[] { 5, 4, -1, 7, 8 }));
		System.out.println(obj.maxSubArrayKadane(new int[] { -2, -3, 4, -1, -2, 1, 5, -3 }));
		System.out.println(obj.maxSubArrayKadane(new int[] { -2, -3, -1, -2, -3 }));
	}

	// Brute Force Approach
	public int maxSubArrayBrute(int[] nums) {
		int n = nums.length;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				// System.out.println("Trying subarray (i,j) = (" + i + "," + j + ")");
				int currSum = 0;
				for (int k = i; k <= j; k++) {
					currSum += nums[k];
				}
				maxSum = Math.max(currSum, maxSum);
			}
		}
		return maxSum;
	}

	// Brute Force Approach - Better
	public int maxSubArrayBruteBetter(int[] nums) {
		int n = nums.length;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int currSum = 0;
			for (int j = i; j < n; j++) {
				currSum += nums[j];
				maxSum = Math.max(currSum, maxSum);
			}
		}
		return maxSum;
	}

	// Kadane's Algorithm
	public int maxSubArrayKadane(int[] nums) {
		int sum = 0;
		int maximum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum < 0) {
				sum = 0;
			}
			maximum = Math.max(maximum, sum);
		}
		if (maximum < 0) {
			return 0;
		}
		return maximum;
	}

}
