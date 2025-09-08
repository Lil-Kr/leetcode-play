package com.cy.leetcodeplay.dp.no198;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/11/3
 * @Description: no.198. House Robber
 *
 * 题意: 小偷偷取房中的宝物, 每个房中都有价值不同的东西, 如果偷取连续房中的宝物将会除法报警系统
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param nums
	 * @return
	 */
	public int rob(int[] nums) {
		return tryRob(nums, 0);
	}

	private int tryRob(int[] nums, int i) {
		if (i >= nums.length) return 0;
		int ans = nums[i] + tryRob(nums, i + 2);
		int skip = tryRob(nums, i + 1);
		return Math.max(ans, skip);
	}

	/**
	 * solution2: memory search
	 * @param nums
	 * @return
	 */
	public int rob1(int[] nums) {
		int[] dp = new int[nums.length];
		Arrays.fill(dp, -1);
		return tryRob1(nums, 0, dp);
	}

	/**
	 * 尝试抢劫 nums[index ... nums.length) 范围内的所有房子
	 * @param nums
	 * @param i
	 */
	private int tryRob1(int[] nums, int i, int[] dp) {
		if (i >= nums.length) return 0;
		if (dp[i] != -1) return dp[i];

		int ans = nums[i] + tryRob1(nums, i + 2, dp);
		int skip = tryRob1(nums, i + 1, dp);
		dp[i] = Math.max(ans, skip);
		return dp[i];
	}

	/**
	 * solution3: dp
	 * down to top
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
		int[] dp = new int[n];

		/**
		 * 设置最基础的子问题
		 */
		dp[n - 1] = nums[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			/**
			 * 从 i 开始的最大收益
			 * 选择抢劫 i 房间和 i+2 房间后的最大值 或者 跳过 i，直接从 i+1 开始的最大值
			 */
			dp[i] = Math.max(nums[i] + (i + 2 < n ? dp[i + 2] : 0), dp[i + 1]);
		}
		return dp[0];
	}

	/**
	 * solution3: dp
	 * differently way to implement
	 * @param nums
	 * @return
	 */
	public int rob2_1(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n + 1];
		dp[n] = 0;
		dp[n - 1] = nums[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			dp[i] = Math.max(nums[i] + dp[i + 2], dp[i + 1]);
		}
		return dp[0];
	}
}