package com.cy.leetcodeplay.dp01.no1049;

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
	 *
	 * @param stones
	 * @return
	 */
	public int lastStoneWeightII(int[] stones) {
		if (stones.length == 1) {
			return stones[0];
		}
		int sum = Arrays.stream(stones).sum();
		int sum1 = sum / 2;
		int near = near(stones, sum1);
		return sum - near - near;
	}

	private int near(int[] stones, int t) {
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