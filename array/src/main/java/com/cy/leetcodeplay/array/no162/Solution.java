package com.cy.leetcodeplay.array.no162;

/**
 * @Author: Lil-K
 * @Date: 2024/10/20
 * @Description: no.162. Find Peak Element
 */
public class Solution {

	/**
	 * 二分查找
	 * @param nums
	 * @return
	 */
	public int findPeakElement(int[] nums) {
		int l = 0;
		int r = nums.length - 1;

		while (l < r) {
			int mid = l + (r - l) / 2;

			/**
			 * 峰值可能在左半部分
			 */
			if (nums[mid] > nums[mid + 1]) {
				r = mid;
			} else { // 峰值可能在右半部分
				l = mid + 1;
			}
		}

		return l;
	}
}
