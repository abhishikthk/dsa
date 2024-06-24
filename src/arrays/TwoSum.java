package arrays;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums1 = { 2, 7, 11, 15 };
		int target1 = 9;

		int[] nums2 = { 3, 2, 4 };
		int target2 = 6;

		int[] nums3 = { 3, 3 };
		int target3 = 6;

//		int[] nums4 = { -10, -3, 2, 4, 8, 15 };
//		int target4 = 5;
//
//		int[] nums5 = { 100000000, 200000000 };
//		int target5 = 300000000;
//
//		int[] nums6 = { 1, 2, 3, 4, 5 };
//		int target6 = 10;
//
//		int[] nums7 = { 5, 5, 5, 5 };
//		int target7 = 10;
//
//		int[] nums8 = new int[1000];
//		for (int i = 0; i < 1000; i++) {
//			nums8[i] = i + 1;
//		}
//		int target8 = 1001;

//		ArrayMain.printIntArray(twoSum(nums1, target1));
//		ArrayMain.printIntArray(twoSum(nums2, target2));
//		ArrayMain.printIntArray(twoSum(nums3, target3));
//		ArrayMain.printIntArray(twoSum(nums4, target4));
//		ArrayMain.printIntArray(twoSum(nums5, target5));
//		ArrayMain.printIntArray(twoSum(nums6, target6));
//		ArrayMain.printIntArray(twoSum(nums7, target7));
//		ArrayMain.printIntArray(twoSum(nums8, target8));

		System.out.println("Two Sum solutions using brute force approach");
		ArrayMain.printIntArray(twoSumBruteForce(nums1, target1));
		ArrayMain.printIntArray(twoSumBruteForce(nums2, target2));
		ArrayMain.printIntArray(twoSumBruteForce(nums3, target3));

		System.out.println("Two Sum solutions using Hash Maps approach");
		ArrayMain.printIntArray(twoSumHashmap(nums1, target1));
		ArrayMain.printIntArray(twoSumHashmap(nums2, target2));
		ArrayMain.printIntArray(twoSumHashmap(nums3, target3));
	}

	/*
	 * Flaw: This can only be used if the Array is already sorted in ASC order.
	 */
	public static int[] twoSum(int[] nums, int target) {
		int i = 0;
		int j = nums.length - 1;
		while (i < j) {
			if (nums[i] + nums[j] == target) {
				return new int[] { i, j };
			}
			if (nums[i] + nums[j] > target) {
				j--;
			} else {
				i++;
			}
		}
		return new int[] { -1, -1 };
	}

	public static int[] twoSumBruteForce(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	public static int[] twoSumHashmap(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(nums[0], 0);
		for (int i = 1; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[] { i, map.get(target - nums[i]) };
			} else {
				map.put(nums[i], i);
			}
		}
		return new int[] { -1, -1 };
	}

}
