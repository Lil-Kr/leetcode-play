package com.cy.leetcodeplay.dp2.no72;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/14
 * @Description: no.72. Edit Distance
 * link: https://leetcode.com/problems/edit-distance/description/
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
		char[] s1 = word1.toCharArray();
		char[] s2 = word2.toCharArray();
		int n = s1.length, m = s2.length;
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i ++) {
			Arrays.fill(dp[i], -1);
		}
		return f1(s1, s2, n, m, 1, 1, 1, dp);
	}

	private int f1(char[] s1, char[] s2, int i, int j, int insert, int del, int replace, int[][] dp) {
		if (i == 0) return j * insert;
		if (j == 0) return i * del;

		if (dp[i][j] != -1) return dp[i][j];
		int ans;
		if (s1[i - 1] == s2[j - 1]) {
			ans = f1(s1, s2, i - 1, j - 1, insert, del, replace, dp);
		} else {
			int p2 = replace + f1(s1, s2, i - 1, j - 1, insert, del, replace, dp);
			int p3 = insert + f1(s1, s2, i, j - 1, insert, del, replace, dp);
			int p4 = del + f1(s1, s2, i - 1, j, insert, del, replace, dp);
			ans = Math.min(p2, Math.min(p3, p4));
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
		char[] s1 = word1.toCharArray();
		char[] s2 = word2.toCharArray();
		int n = s1.length, m = s2.length;
		return f2(s1, s2, n, m,1, 1, 1);
	}

	/**
	 * @param s1 word1
	 * @param s2 word2
	 * @param insert insert
	 * @param del delete
	 * @param replace update
	 * @return res
	 */
	private int f2(char[] s1, char[] s2, int n, int m, int insert, int del, int replace) {
		// s1[前缀长度为i] 变为 s2[前缀长度为j], 至少付出多少代价
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i ++) {
			dp[i][0] = i * del;
		}
		for (int j = 1; j <= m; j ++) {
			dp[0][j] = j * insert;
		}

		for (int i = 1; i <= n; i ++) {
			for (int j = 1; j <= m; j++) {
				int p1 = Integer.MAX_VALUE;
				if (s1[i - 1] == s2[j - 1]) {
					p1 = dp[i - 1][j - 1];
				}

				int p2 = Integer.MAX_VALUE;
				if (s1[i - 1] != s2[j - 1]) {
					p2 = dp[i - 1][j - 1] + replace;
				}

				int p3 = dp[i][j - 1] + insert;
				int p4 = dp[i - 1][j] + del;
				dp[i][j] = Math.min(Math.min(p1, p2), Math.min(p3, p4));
			}
		}
		return dp[n][m];
	}

	/**
	 * solution3: dp + space compression
	 * @param word1
	 * @param word2
	 * @return
	 */
	public int minDistance3(String word1, String word2) {
		char[] s1 = word1.toCharArray();
		char[] s2 = word2.toCharArray();
		return f3(s1, s2, 1, 1, 1);
	}

	/**
	 * @param s1
	 * @param s2
	 * @param insert
	 * @param del
	 * @param replace
	 * @return
	 */
	private int f3(char[] s1, char[] s2, int insert, int del, int replace) {
		int n = s1.length, m = s2.length;
		int[] dp = new int[m + 1];
		for (int j = 0; j <= m; j++) {
			dp[j] = j * insert;
		}

		for (int i = 1, leftUp, backUp; i <= n; i ++) {
			leftUp = (i - 1) * del;
			dp[0] = i * del;
			for (int j = 1; j <= m; j ++) {
				backUp = dp[j];
				if (s1[i - 1] == s2[j - 1]) {
					dp[j] = leftUp;
				} else {
					dp[j] = Math.min(Math.min(dp[j] + del, dp[j - 1] + insert), leftUp + replace);
				}
				leftUp = backUp;
			}
		}

		return dp[m];
	}
}