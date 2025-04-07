package com.cy.leetcodeplay.greedy.no55;

/**
 * @Author: Lil-K
 * @Date: 2025/4/7
 * @Description: no.55. Jump Game
 * link: https://leetcode.com/problems/jump-game/description/
 */
public class Solution {

	/**
	 * @param nums
	 * @return
	 */
	public boolean canJump(int[] nums) {
		int maxReach = 0;
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			// 当前位置不可达
			if (i > maxReach) return false;

			maxReach = Math.max(maxReach, i + nums[i]);
			if (maxReach >= n - 1) return true;
		}
		return true;
	}
}
