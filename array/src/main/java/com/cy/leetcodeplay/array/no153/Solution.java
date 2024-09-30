package com.cy.leetcodeplay.array.no153;

/**
 * @Author: Lil-K
 * @Date: 2024/9/29
 * @Description: no.153. Find Minimum in Rotated Sorted Array
 *
 * 二分搜索
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @return
	 */
	public int findMin(int[] nums) {
		if (nums.length < 1) return -1;

		int l = 0, r = nums.length - 1;
		while (l < r) {
			int mid = l + (r - l) / 2;

			if (nums[mid] > nums[r]) {
				l = mid + 1;
			} else {
				r = mid;
			}
		}

		return nums[l];
	}
}