package com.cy.leetcodeplay.dp1.no343;

/**
 * @Author: Lil-K
 * @Date: 2025/9/29
 * @Description: no.343. Integer Break
 * link: https://leetcode.com/problems/integer-break/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive + memory search
	 * @param n
	 * @return
	 */
	public int integerBreak(int n) {
		int[] dp = new int[n + 1];
		dp[2] = 1;
		return f1(n, dp);
	}

	private int f1(int n, int[] dp) {
		if (n == 2) {
			return 1;
		}

		if (dp[n] != 0) {
			return dp[n];
		}

		int ans = 0;
		for (int i = 1; i < n; i ++) {
			// 不继续拆分
			int p1 = i * (n - i);
			// 继续拆分
			int p2 = i * f1(n - i, dp);
			ans = Math.max(ans, Math.max(p1, p2));
		}
		dp[n] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * @param n
	 * @return
	 */
	public int integerBreak2(int n) {
		int[] dp = new int[n + 1];
		dp[2] = 1;

		for (int i = 3; i <= n; i ++) {
			for (int j = 1; j < i; j++) {
				dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
			}
		}
		return dp[n];
	}
}