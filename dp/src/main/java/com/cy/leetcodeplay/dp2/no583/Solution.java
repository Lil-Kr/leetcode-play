package com.cy.leetcodeplay.dp2.no583;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/10
 * @Description: no.583. Delete Operation for Two Strings
 * link: https://leetcode.com/problems/delete-operation-for-two-strings/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param word1
	 * @param word2
	 * @return
	 */
	public int minDistance(String word1, String word2) {
		char[] w1 = word1.toCharArray();
		char[] w2 = word2.toCharArray();
		int n = w1.length, m = w2.length;

		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i ++) {
			Arrays.fill(dp[i], -1);
		}

		int ans = f1(w1, w2, n, m, dp);
		return (n - ans) + (m - ans);
	}

	private int f1(char[] w1, char[] w2, int i, int j, int[][] dp) {
		if (i == 0 || j == 0) {
			return 0;
		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int ans;
		if (w1[i - 1] == w2[j - 1]) {
			ans = 1 + f1(w1, w2, i - 1, j - 1, dp);
		} else {
			ans = Math.max(f1(w1, w2, i - 1, j, dp), f1(w1, w2, i, j - 1, dp));
		}

		dp[i][j] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * @param word1
	 * @param word2
	 * @return
	 */
	public int minDistance2(String word1, String word2) {
		char[] w1 = word1.toCharArray();
		char[] w2 = word2.toCharArray();
		int n = w1.length, m = w2.length;

		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i ++) {
			for (int j = 1; j <= m; j ++) {
				if (w1[i - 1] == w2[j - 1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return (n - dp[n][m]) + (m - dp[n][m]);
	}
}