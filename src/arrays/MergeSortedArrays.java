package arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		MergeSortedArrays obj = new MergeSortedArrays();
		int[] nums1 = { 0, 3, 4, 31 };
		int[] nums2 = { 4, 6, 30 };
		ArrayMain.printIntArray(obj.mergeSortedArrays(nums1, nums2));
	}

	public int[] mergeSortedArrays(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length + nums2.length];
		int n1 = nums1.length;
		int n2 = nums2.length;
		int i = 0, j = 0, index = 0;

		while (i < n1 && j < n2) {
			if (nums1[i] <= nums2[j]) {
				result[index] = nums1[i];
				i++;
				index++;
			} else {
				result[index] = nums2[j];
				j++;
				index++;
			}
		}
		while (i < n1) {
			result[index] = nums1[i];
			i++;
			index++;
		}

		while (j < n2) {
			result[index] = nums2[j];
			j++;
			index++;
		}

		return result;
	}
}
