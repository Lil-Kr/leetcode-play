package com.cy.leetcodeplay.dpstatemachine.no188;

/**
 * @Author: Lil-K
 * @Date: 2025/10/11
 * @Description: no.188. Best Time to Buy and Sell Stock IV
 * link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1:
	 * @param k
	 * @param prices
	 * @return
	 */
	public int maxProfit(int k, int[] prices) {
		int n = prices.length;
		if (k >= n / 2) {
			return free(prices);
		}
		int[][] dp = new int[k + 1][n];
		for (int i = 1; i <= k; i ++) {
			for (int j = 1; j < n; j ++) {
				dp[i][j] = dp[i][j - 1];
				// 枚举所有的p
				for (int p = 0; p < j; p ++) {
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][p] + prices[j] - prices[p]);
				}
			}
		}
		return dp[k][n - 1];
	}

	private int free(int[] prices) {
		int n = prices.length;
		int ans = 0;
		for (int i = 1; i < n; i ++) {
			ans += Math.max(0, prices[i] - prices[i - 1]);
		}
		return ans;
	}

	/**
	 * solution2:
	 * 优化枚举
	 * @param k
	 * @param prices
	 * @return
	 */
	public int maxProfit2(int k, int[] prices) {
		int n = prices.length;
		if (k >= n / 2) {
			return free(prices);
		}

		int[][] dp = new int[k + 1][n];
		for (int i = 1, best; i <= k; i ++) {
			best = dp[i - 1][0] - prices[0];
			for (int j = 1; j < n; j ++) {
				dp[i][j] = Math.max(dp[i][j - 1], best + prices[j]);
				best = Math.max(best, dp[i - 1][j] - prices[j]);
			}
		}
		return dp[k][n - 1];
	}

	/**
	 * solution3:
	 * space compression
	 * @param k
	 * @param prices
	 * @return
	 */
	public int maxProfit3(int k, int[] prices) {
		int n = prices.length;
		if (k >= n / 2) {
			return free(prices);
		}
		int[] dp = new int[n];
		for (int i = 1, best, temp; i <= k; i ++) {
			best = dp[0] - prices[0];
			for (int j = 1; j < n; j ++) {
				temp = dp[j];
				dp[j] = Math.max(dp[j - 1], best + prices[j]);
				best = Math.max(best, temp - prices[j]);
			}
		}
		return dp[n - 1];
	}
}