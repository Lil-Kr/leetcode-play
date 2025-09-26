package com.cy.leetcodeplay.dpgroupall.no322;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/26
 * @Description: no.322. Coin Change
 * link: https://leetcode.com/problems/coin-change/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param coins
	 * @param amount
	 * @return
	 */
	public int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, -2);
		return f1(coins, amount, dp);
	}

	private int f1(int[] coins, int amount, int[] dp) {
		if (amount == 0) {
			return 0;
		}
		if (amount < 0) {
			return -1;
		}

		if (dp[amount] != -2) {
			return dp[amount];
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < coins.length; i ++) {
			int sub = f1(coins, amount - coins[i], dp);
			if (sub >= 0) {
				ans = Math.min(ans, sub + 1);
			}
		}
		dp[amount] = (ans == Integer.MAX_VALUE) ? -1 : ans;
		return dp[amount];
	}

	/**
	 * solution2: dp
	 * @param coins
	 * @param amount
	 * @return
	 */
	public int coinChange2(int[] coins, int amount) {
		int n = coins.length;
		int max = amount + 1;
		// dp[i][j] 表示用前 i 种硬币凑金额 j 的最少硬币数
		int[][] dp = new int[n + 1][amount + 1];

		// 初始化 dp[0][j] = max，dp[i][0] = 0
		for (int j = 1; j <= amount; j++) {
			dp[0][j] = max;  // 不用任何硬币无法凑金额>0
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= amount; j++) {
				// 情况1：不选第 i 种硬币
				int notTake = dp[i - 1][j];

				// 情况2：选第 i 种硬币
				int take = max;
				if (j >= coins[i - 1] && dp[i][j - coins[i - 1]] != max) {
					take = dp[i][j - coins[i - 1]] + 1;
				}

				dp[i][j] = Math.min(notTake, take);
			}
		}

		return dp[n][amount] == max ? -1 : dp[n][amount];
	}

	/**
	 * solution3: dp + space compression
	 * @param coins
	 * @param amount
	 * @return
	 */
	public int coinChange3(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, amount + 1);
		dp[0] = 0;
		for (int j = 1; j <= amount; j ++) {
			for (int coin : coins) {
				if (j - coin >= 0) {
					dp[j] = Math.min(dp[j], dp[j - coin] + 1);
				}
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
	}
}