package com.cy.leetcodeplay.dp.no198;

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
		int n = nums.length;
		int[] dp = new int[n];
		return tryRob(nums, 0, dp);
	}

	private int tryRob(int[] nums, int i, int[] dp) {
		if (i >= nums.length) return 0;
		if (dp[i] != -1) return dp[i];

		int ans = nums[i] + tryRob(nums, i + 2, dp);
		int skip = tryRob(nums, i + 1, dp);
		dp[i] = Math.max(ans, skip);
		return dp[i];
	}

	/**
	 * solution2: dp
	 * down to top
	 * @param nums
	 * @return
	 */
	public int rob2(int[] nums) {
		int n = nums.length;

		if (n == 1) return nums[0];
		if (n == 2) return Math.max(nums[0], nums[1]);

		/**
		 * memo[i] 表示考虑抢劫 nums[i ... n - 1] 所能获得的最大收益
		 */
		int[] dp = new int[n];

		/**
		 * 设置最基础的子问题
		 */
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);

		for (int i = 2; i < n; i ++) {
			/**
			 * 从 i 开始的最大收益
			 * 选择抢劫 i 房间和 i+2 房间后的最大值 或者 跳过 i，直接从 i+1 开始的最大值
			 */
			dp[i] = Math.max(dp[i - 1], Math.max(nums[i], nums[i] + dp[i - 2]));
		}
		return dp[n - 1];
	}

	/**
	 * solution4: dp + space compression
	 * differently way to implement
	 * @param nums
	 * @return
	 */
	public int rob3(int[] nums) {
		int n = nums.length;
		if (n == 1) return nums[0];
		if (n == 2) return Math.max(nums[0], nums[1]);

		int prepre = nums[0], pre = Math.max(nums[0], nums[1]);

		for (int i = 2, cur; i < n; i ++) {
			cur = Math.max(pre, Math.max(nums[i], nums[i] + prepre));
			prepre = pre;
			pre = cur;
		}
		return pre;
	}
}