package com.cy.leetcodeplay.dp2.no712;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/10
 * @Description: no.712. Minimum ASCII Delete Sum for Two Strings
 * link: https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param str1
	 * @param str2
	 * @return
	 */
	public int minimumDeleteSum(String str1, String str2) {
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();

		int n = s1.length, m = s2.length;
		int sum1 = 0, sum2 = 0;
		for (char c : s1) sum1 += c;
		for (char c : s2) sum2 += c;

		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i ++) {
			Arrays.fill(dp[i], -1);
		}
		int ans = f1(s1, s2, n, m, dp);
		return sum1 + sum2 - 2 * ans;
	}

	private int f1(char[] s1, char[] s2, int i, int j, int[][] dp) {
		if (i == 0 || j == 0) {
			return 0;
		}

		if (dp[i][j] != -1) return dp[i][j];
		int ans = 0;
		if (s1[i - 1] == s2[j - 1]) {
			ans = (int)s1[i - 1] + f1(s1, s2, i - 1, j - 1, dp);
		} else {
			ans = Math.max(f1(s1, s2, i, j - 1, dp), f1(s1, s2, i - 1, j, dp));
		}

		dp[i][j] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * @param str1
	 * @param str2
	 * @return
	 */
	public int minimumDeleteSum2(String str1, String str2) {
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();

		int n = s1.length, m = s2.length;
		int sum1 = 0, sum2 = 0;
		for (char c : s1) sum1 += c;
		for (char c : s2) sum2 += c;

		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i ++) {
			for (int j = 1; j <= m; j ++) {
				if (s1[i - 1] == s2[j - 1]) {
					dp[i][j] = s1[i - 1] + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return sum1 + sum2 - 2 * dp[n][m];
	}
}