package com.cy.leetcodeplay.dp1.no1137;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/8
 * @Description: no.1137. N-th Tribonacci Number
 * link: https://leetcode.com/problems/n-th-tribonacci-number/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param n
	 * @return
	 */
	public int tribonacci(int n) {
		return f1(n);
	}

	private int f1(int n) {
		if (n == 0) return 0;
		if (n <= 2) return 1;

		return f1(n - 1) + f1(n - 2) + f1(n - 3);
	}

	/**
	 * solution2: recursive + memory search
	 * @param n
	 * @return
	 */
	public int tribonacci2(int n) {
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		return f2(n, dp);
	}

	private int f2(int n, int[] dp) {
		if (n == 0) return 0;
		if (n <= 2) return 1;
		if (dp[n] != -1) return dp[n];
		dp[n] = f2(n - 1, dp) + f2(n - 2, dp) + f2(n - 3, dp);
		return dp[n];
	}

	/**
	 * solution3: dp
	 * down to top
	 * @param n
	 * @return
	 */
	public int tribonacci3(int n) {
		if (n == 0) return 0;
		if (n <= 2) return 1;

		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;

		for (int i = 3; i <= n; i ++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}
		return dp[n];
	}
}