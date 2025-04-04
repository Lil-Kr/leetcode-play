package com.cy.leetcodeplay.dp.no198;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/11/3
 * @Description: no.198. House Robber
 *
 * 题意: 小偷偷取房中的宝物, 每个房中都有价值不同的东西, 如果偷取连续房中的宝物将会除法报警系统
 *
 * todo: 未录入题库
 */
public class Solution {

	/**
	 * memo[i] 表示考虑抢劫 nums[i ... n) 所能获得的最大收益
	 */
	private int[] memo;

	/**
	 * 解法一: 自顶向下
	 * @param nums
	 * @return
	 */
	public int rob(int[] nums) {
		memo = new int[nums.length];
		Arrays.fill(memo, -1);
		return tryRob(nums, 0);
	}

	/**
	 * 尝试抢劫 nums[index ... nums.length) 范围内的所有房子
	 * @param nums
	 * @param index
	 */
	private int tryRob(int[] nums, int index) {
		if (index >= nums.length) return 0;

		if (memo[index] != -1) {
			return memo[index];
		}

		int res = 0;
		for (int i = index; i < nums.length; i++) {
			res = Math.max(res, nums[i] + tryRob(nums, i + 2));
		}

		memo[index] = res;
		return res;
	}

	/** ================== 动态规划 ================= **/

	/**
	 * 解法二: 动态规划
	 * @param nums
	 * @return
	 */
	public int rob2(int[] nums) {
		int n = nums.length;

		if (n == 0) return 0;
		if (n == 1) return nums[0];

		/**
		 * memo[i] 表示考虑抢劫 nums[i ... n - 1] 所能获得的最大收益
		 */
		int[] memo = new int[n];

		/**
		 * 设置最基础的子问题
		 */
		memo[n - 1] = nums[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			/**
			 * 从 i 开始的最大收益
			 * 选择抢劫 i 房间和 i+2 房间后的最大值 或者 跳过 i，直接从 i+1 开始的最大值
			 */
			memo[i] = Math.max(nums[i] + (i + 2 < n ? memo[i + 2] : 0), memo[i + 1]);
		}
		return memo[0];
	}
}