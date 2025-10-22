package com.cy.leetcodeplay.dplis.no376;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/22
 * @Description: no.376. Wiggle Subsequence
 * link: https://leetcode.com/problems/wiggle-subsequence/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: dp
	 * @param nums
	 * @return
	 */
	public int wiggleMaxLength(int[] nums) {
		int n = nums.length;
		if (n < 2) return n;

		int[] up = new int[n];
		int[] down = new int[n];
		Arrays.fill(up, 1);
		Arrays.fill(down, 1);

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				// 上升
				if (nums[i] > nums[j]) {
					up[i] = Math.max(up[i], down[j] + 1);
				} else if (nums[i] < nums[j]) {
					// 下降
					down[i] = Math.max(down[i], up[j] + 1);
				}
			}
		}
		return Math.max(up[n - 1], down[n - 1]);
	}

	/**
	 * solution2: dp + space compression
	 * @param nums
	 * @return
	 */
	public int wiggleMaxLength2(int[] nums) {
		int n = nums.length;
		if (n < 2) return n;

		int up = 1, down = 1;
		for (int i = 1; i < n; i++) {
			// 上升
			if (nums[i] > nums[i - 1]) {
				up = down + 1;
			} else if (nums[i] < nums[i - 1]) {
				// 下降
				down = up + 1;
			}
		}
		return Math.max(up, down);
	}
}