package com.cy.leetcodeplay.prefixsum.no724;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/25
 * @Description: no.724. Find Pivot Index
 * link: https://leetcode.com/problems/find-pivot-index/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1:
	 * @param nums
	 * @return
	 */
	public int pivotIndex(int[] nums) {
		int n = nums.length;
		int sum = Arrays.stream(nums).sum();

		int left = 0, right = 0;
		for (int i = 0; i < n; i ++) {
			if (i - 1 < 0) {
				left = 0;
			} else {
				left += nums[i - 1];
			}

			right = sum - nums[i] - left;
			if (left == right) {
				return i;
			}
		}
		return -1;
	}
}