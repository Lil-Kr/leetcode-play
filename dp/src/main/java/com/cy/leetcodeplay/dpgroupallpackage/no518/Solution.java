package com.cy.leetcodeplay.dpgroupallpackage.no518;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/24
 * @Description: no.518. Coin Change II
 * link: https://leetcode.com/problems/coin-change-ii/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param amount
	 * @param coins
	 * @return
	 */
	public int change(int amount, int[] coins) {
		int n = coins.length;
		int[][] dp = new int[n + 1][amount + 1];
		for (int i = 0; i <= n; i ++) {
			Arrays.fill(dp[i], -1);
		}
		return f1(coins, amount, n, 0, dp);
	}

	private int f1(int[] coins, int amount, int n, int index, int[][] dp) {
		if (amount == 0) return 1;
		if (index == n || amount < 0) return 0;

		if (dp[index][amount] != -1) {
			return dp[index][amount];
		}

		int ans = f1(coins, amount, n, index + 1, dp) + f1(coins, amount - coins[index], n, index, dp);
		dp[index][amount] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * @param amount
	 * @param coins
	 * @return
	 */
	public int change2(int amount, int[] coins) {
		int n = coins.length;
		int[][] dp = new int[n + 1][amount + 1];
		// 当金额为 0 时, 有1种方案可以选, (不选)
		for (int i = 0; i <= n; i ++) {
			dp[i][0] = 1;
		}

		for (int i = 1; i <= n; i ++) {
			for (int j = 1; j <= amount; j ++) {
				dp[i][j] = dp[i - 1][j];
				if (j - coins[i - 1] >= 0) {
					dp[i][j] += dp[i][j - coins[i - 1]];
				}
			}
		}

		return dp[n][amount];
	}

	/**
	 * solution3: dp + space compression
	 * @param amount
	 * @param coins
	 * @return
	 */
	public int change3(int amount, int[] coins) {
		int[] dp = new int[amount + 1];
		dp[0] = 1;

		for (int coin : coins) {
			for (int j = coin; j <= amount; j++) {
				dp[j] += dp[j - coin];
			}
		}

		return dp[amount];
	}
}