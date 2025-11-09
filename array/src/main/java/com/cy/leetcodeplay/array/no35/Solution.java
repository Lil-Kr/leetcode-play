package com.cy.leetcodeplay.array.no35;

/**
 * @Author: Lil-K
 * @Date: 2024/9/29
 * @Description: no.35. Search Insert Position
 */
public class Solution {

	/**
	 * solution1: binary search
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchInsert(int[] nums, int target) {
		int n = nums.length;
		int l = 0, r = n - 1, mid;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (nums[mid] == target) {
				return mid;
			}

			if (nums[mid] < target) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return l;
	}

	/**
	 * solution2: traverse
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchInsert2(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target || nums[i] > target) {
				return i;
			}
		}
		return nums.length;
	}
}