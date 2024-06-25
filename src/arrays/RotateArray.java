package arrays;

public class RotateArray {

	public static void main(String[] args) {

		RotateArray obj = new RotateArray();

		ArrayMain.printIntArray(obj.rotateArray(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3));
		ArrayMain.printIntArray(obj.rotateArray(new int[] { -1, -100, 3, 99 }, 2));

		System.out.println("Rotating array using reversal method");
		ArrayMain.printIntArray(obj.rotateArrayReverse(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3));
		ArrayMain.printIntArray(obj.rotateArrayReverse(new int[] { -1, -100, 3, 99 }, 2));
	}

	public int[] rotateArray(int[] nums, int k) {
		k = k % nums.length;

		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int newIndex = i + k;
			// System.out.println(">>> New Index = "+newIndex);
			if (newIndex > nums.length - 1) {
				newIndex = newIndex - nums.length;
			}
			// System.out.println(">>> New updated Index = "+newIndex);
			result[newIndex] = nums[i];
		}
		return result;
	}

	public int[] rotateArrayReverse(int[] nums, int k) {
		k = k % nums.length;
		if (k < 0) {
			k = k + nums.length;
		}
		nums = reverseArray(nums, 0, nums.length - 1);
		nums = reverseArray(nums, 0, k - 1);
		nums = reverseArray(nums, k, nums.length - 1);

		return nums;
	}

	public int[] reverseArray(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		return nums;
	}

}
