package com.cy.leetcodeplay.greedy.no45;

/**
 * @Author: Lil-K
 * @Date: 2025/4/7
 * @Description: no.45. Jump Game II
 * link: https://leetcode.com/problems/jump-game-ii/description/
 */
public class Solution {

	/**
	 * @param nums
	 * @return
	 */
	public int jump(int[] nums) {
		// 记录跳跃的次数
		int jumps = 0, n = nums.length;
		// 当前跳跃的边界, 到这个边界内必须完成一次跳跃
		int end = 0;
		// 当前能跳的最远位置
		int farthest = 0;

		for (int i = 0; i < n - 1; i++) {
			farthest = Math.max(farthest, i + nums[i]);
			// 准备进行跳跃
			if (i == end) {
				jumps++;
				end = farthest;
			}
		}

		return jumps;
	}
}