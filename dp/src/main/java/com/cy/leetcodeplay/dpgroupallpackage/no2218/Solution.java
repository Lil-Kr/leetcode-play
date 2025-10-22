package com.cy.leetcodeplay.dpgroupallpackage.no2218;

import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2025/9/26
 * @Description: no.2218. Maximum Value of K Coins From Piles
 * link: https://leetcode.com/problems/maximum-value-of-k-coins-from-piles/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 *
	 * @param piles
	 * @param k
	 * @return
	 */
	public int maxValueOfCoins(List<List<Integer>> piles, int k) {
		int n = piles.size();
		int[][] dp = new int[n + 1][k + 1];
		for (int i = 1; i <= n; i ++) {
			List<Integer> team = piles.get(i - 1);
			int t = Math.min(team.size(), k);

			int[] preSum = new int[t + 1];
			for (int j = 0, sum = 0; j < t; j ++) {
				sum += team.get(j);
				preSum[j + 1] = sum;
			}

			// dp update
			for (int j = 0; j <= k; j ++) {
				// 当前组一个硬币也不拿的方案
				dp[i][j] = dp[i - 1][j];
				for (int m = 1; m <= Math.min(t, j); m ++) {
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - m] + preSum[m]);
				}
			}
		}
		return dp[n][k];
	}
}