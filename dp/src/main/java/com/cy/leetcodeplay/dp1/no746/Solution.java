package com.cy.leetcodeplay.dp1.no746;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/8
 * @Description: no.746. Min Cost Climbing Stairs
 * link: https://leetcode.com/problems/min-cost-climbing-stairs/description
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param cost
	 * @return
	 */
	public int minCostClimbingStairs(int[] cost) {
		return Math.min(f1(cost, 0), f1(cost, 1));
	}

	private int f1(int[] cost, int i) {
		if (i >= cost.length) return 0;
		return cost[i] + Math.min(f1(cost, i + 1), f1(cost, i + 2));
	}

	/**
	 * solution2: recursive + memory search
	 * @param cost
	 * @return
	 */
	public int minCostClimbingStairs2(int[] cost) {
		int[] dp = new int[cost.length];
		Arrays.fill(dp, -1);
		return Math.min(f2(cost, 0, dp), f2(cost, 1, dp));
	}


	private int f2(int[] cost, int i, int[] dp) {
		if (i >= cost.length) return 0;
		if (dp[i] != -1) return dp[i];
		dp[i] = cost[i] + Math.min(f2(cost, i + 1, dp), f2(cost, i + 2, dp));
		return dp[i];
	}

	/**
	 * solution2: recursive + memory search
	 * @param cost
	 * @return
	 */
	public int minCostClimbingStairs3(int[] cost) {
		int n = cost.length;
		int[] dp = new int[n + 1];
		dp[n] = 0;
		dp[n - 1] = cost[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
		}
		return Math.min(dp[0], dp[1]);

		/**
		 * opposite code
		 */
		/**
		 * int n = cost.length;
		 * int[] dp = new int[n + 1];
		 * dp[0] = 0;
		 * dp[1] = 0;
		 * for (int i = 2; i <= n; i++) {
		 * 	dp[i] = Math.min(cost[i - 1] + dp[i - 1], cost[i - 2] + dp[i - 2]);
		 * }
		 * return dp[n];
		 */
	}

}