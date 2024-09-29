package com.cy.leetcodeplay.array.no35;

/**
 * @Author: Lil-K
 * @Date: 2024/9/29
 * @Description: no.35. Search Insert Position
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchInsert(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			} else if (nums[i] > target) {
				return i;
			}
		}
		return nums.length;
	}

}