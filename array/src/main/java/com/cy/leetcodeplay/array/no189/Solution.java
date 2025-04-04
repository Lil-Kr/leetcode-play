package com.cy.leetcodeplay.array.no189;

/**
 * @Author: Lil-K
 * @Date: 2024/10/22
 * @Description: no.189. Rotate Array
 *
 * 1. 反转整个数组.
 * 2. 反转前 k 个元素.
 * 3. 反转剩余的元素.
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @param k
	 */
	public void rotate(int[] nums, int k) {
		if (nums.length <= 1 || k == 0) return;

		int n = nums.length;
		if (k % n == 0) return;

		k = k % n;

		/**
		 * 反转整个数组: [7,6,5,4,3,2,1]
		 */
		reverse(nums, 0, n - 1);
		/**
		 * 反转前k个元素
		 * [5,6,7,4,3,2,1]
		 */
		reverse(nums, 0, k - 1);

		/**
		 * 反转剩余元素
		 * [5,6,7,1,2,3,4]
		 */
		reverse(nums, k, n - 1);
	}

	private void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
