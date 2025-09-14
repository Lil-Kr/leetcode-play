package com.cy.leetcodeplay.dp.no72;

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
	 * solution1: dp
	 * @param word1
	 * @param word2
	 * @return
	 */
	public int minDistance(String word1, String word2) {
		char[] s1 = word1.toCharArray();
		char[] s2 = word2.toCharArray();
		return minDistance1(s1, s2, 1, 1, 1);
	}

	/**
	 *
	 * @param s1 word1
	 * @param s2 word2
	 * @param a insert
	 * @param b delete
	 * @param c update
	 * @return res
	 */
	private int minDistance1(char[] s1, char[] s2, int a, int b, int c) {
		int n = s1.length, m = s2.length;
		// s1[前缀长度为i] 变为 s2[前缀长度为j], 至少付出多少代价
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i ++) {
			dp[i][0] = i * b;
		}
		for (int j = 1; j <= m; j ++) {
			dp[0][j] = j * a;
		}

		for (int i = 1; i <= n; i ++) {
			for (int j = 1; j <= m; j++) {
				int p1 = Integer.MAX_VALUE;
				if (s1[i - 1] == s2[j - 1]) {
					p1 = dp[i - 1][j - 1];
				}

				int p2 = Integer.MAX_VALUE;
				if (s1[i - 1] != s2[j - 1]) {
					p2 = dp[i - 1][j - 1] + c;
				}

				int p3 = dp[i][j - 1] + a;
				int p4 = dp[i - 1][j] + b;
				dp[i][j] = Math.min(Math.min(p1, p2), Math.min(p3, p4));
			}
		}
		return dp[n][m];
	}

	/**
	 * solution2: dp + space compression
	 * @param word1
	 * @param word2
	 * @return
	 */
	public int minDistance2(String word1, String word2) {
		char[] s1 = word1.toCharArray();
		char[] s2 = word2.toCharArray();
		return minDistance2(s1, s2, 1, 1, 1);
	}

	/**
	 * @param s1
	 * @param s2
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	private int minDistance2(char[] s1, char[] s2, int a, int b, int c) {
		int n = s1.length, m = s2.length;
		int[] dp = new int[m + 1];
		for (int j = 0; j <= m; j++) {
			dp[j] = j * a;
		}

		for (int i = 1, leftUp, backUp; i <= n; i ++) {
			leftUp = (i - 1) * b;
			dp[0] = i * b;
			for (int j = 1; j <= m; j ++) {
				backUp = dp[j];
				if (s1[i - 1] == s2[j - 1]) {
					dp[j] = leftUp;
				} else {
					dp[j] = Math.min(Math.min(dp[j] + b, dp[j - 1] + a), leftUp + c);
				}
				leftUp = backUp;
			}
		}

		return dp[m];
	}
}