package com.cy.leetcodeplay.matrix.dp.no213;

/**
 * @Author: Lil-K
 * @Date: 2024/11/3
 * @Description: no.213. House Robber II
 * todo: 未录入题库
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @return
	 */
	public int rob(int[] nums) {
		if (nums.length == 1) return nums[0];

		int n = nums.length;

		return Math.max(robRange(nums, 0, n - 2), robRange(nums, 1, n - 1));
	}

	/**
	 * 线性抢劫子问题的解法：从 start 到 end 的最大抢劫金额
	 * @param nums
	 * @param start
	 * @param end
	 * @return
	 */
	private int robRange(int[] nums, int start, int end) {
		int prevTwo = 0, prevOne = 0;
		for (int i = start; i <= end; i++) {
			int cur = Math.max(prevOne, prevTwo + nums[i]);
			prevTwo = prevOne;
			prevOne = cur;
		}
		return prevOne;
	}
}