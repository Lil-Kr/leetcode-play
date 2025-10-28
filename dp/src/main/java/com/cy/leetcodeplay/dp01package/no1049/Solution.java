package com.cy.leetcodeplay.dp01package.no1049;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/24
 * @Description: no.1049 Last Stone Weight II
 * link: https://leetcode.com/problems/last-stone-weight-ii/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: dp
	 * @param stones
	 * @return
	 */
	public int lastStoneWeightII(int[] stones) {
		int n = stones.length;
		int sum = Arrays.stream(stones).sum();
		int near = near(stones, sum / 2);
		return sum - (2 * near);
	}

	private int near(int[] stones, int t) {
		int n = stones.length;
		int[][] dp = new int[n + 1][t + 1];

		for (int i = 1; i <= n; i ++) {
			for (int j = 1; j <= t; j ++) {
				dp[i][j] = dp[i - 1][j];
				if (j - stones[i - 1] >= 0) {
					dp[i][j] = Math.max(dp[i - 1][j - stones[i - 1]] + stones[i - 1], dp[i][j]);
				}
			}
		}
		return dp[n][t];
	}


	/**
	 * solution2: dp + space compression
	 * @param stones
	 * @return
	 */
	public int lastStoneWeightII2(int[] stones) {
		if (stones.length == 1) {
			return stones[0];
		}
		int sum = Arrays.stream(stones).sum();
		int sum1 = sum / 2;
		int near = near2(stones, sum1);
		return sum - near - near;
	}

	private int near2(int[] stones, int t) {
		int[] dp = new int[t + 1];
		for (int stone : stones) {
			for (int j = t; j >= stone; j --) {
				// dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - stone] + stone);
				dp[j] = Math.max(dp[j], dp[j - stone] + stone);
			}
		}
		return dp[t];
	}
}