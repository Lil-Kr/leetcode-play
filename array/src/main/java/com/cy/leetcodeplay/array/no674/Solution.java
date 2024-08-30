package com.cy.leetcodeplay.array.no674;

/**
 * @Author: Lil-K
 * @Date: 2024/8/30
 * @Description:
 * 1. 要连续, [0,1,1,1,1,6,7,5]  --> [0,1], [1,6]
 */
public class Solution {

	public static int findLengthOfLCIS(int[] nums) {
		if (nums.length <= 1) return nums.length;

		int maxLength = 1;
		int currentLength = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] < nums[i]) {
				currentLength ++;
			} else {
				currentLength = 1;
			}
			maxLength = Math.max(maxLength, currentLength);
		}

		return maxLength;
	}
}
