package arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		MoveZeroes obj = new MoveZeroes();

		ArrayMain.printIntArray(obj.moveZeroes(new int[] { 0, 1, 0, 3, 12 }));
		ArrayMain.printIntArray(obj.moveZeroes(new int[] { 0 }));
		ArrayMain.printIntArray(obj.moveZeroes(new int[] { 0, 1, 0, 0, 3 }));
	}

	public int[] moveZeroes(int[] nums) {
		int left = 0;
		for (int right = 0; right < nums.length; right++) {
			if (nums[right] != 0) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
			}
		}
		return nums;
	}

}
