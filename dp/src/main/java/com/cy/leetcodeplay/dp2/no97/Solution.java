package com.cy.leetcodeplay.dp2.no97;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/14
 * @Description: no.97. Interleaving String
 * link: https://leetcode.com/problems/interleaving-string/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param str1
	 * @param str2
	 * @param str3
	 * @return
	 */
	public boolean isInterleave(String str1, String str2, String str3) {
		int n = str1.length(), m = str2.length(), t = str3.length();
		if (n + m != t) return false;

		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		char[] s3 = str3.toCharArray();

		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i ++) {
			Arrays.fill(dp[i], -1);
		}
		return f1(s1, s2, s3, n, m, dp);
	}

	private boolean f1(char[] s1, char[] s2, char[] s3, int i, int j, int[][] dp) {
		if (i == 0 && j == 0) return true;
		if (dp[i][j] != -1) return dp[i][j] == 1;

		boolean ans = false;
		if (i > 0 && s1[i - 1] == s3[i + j - 1]) {
			ans = ans || f1(s1, s2, s3, i - 1, j, dp);
		}

		if (j > 0 && s2[j - 1] == s3[i + j - 1]) {
			ans = ans || f1(s1, s2, s3, i, j - 1, dp);
		}

		dp[i][j] = ans ? 1 : 0;
		return ans;
	}

	/**
	 * solution2: dp
	 * @param str1
	 * @param str2
	 * @param str3
	 * @return
	 */
	public boolean isInterleave2(String str1, String str2, String str3) {
		if (str1.length() + str2.length() != str3.length()) return false;

		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		char[] s3 = str3.toCharArray();

		int n = s1.length, m = s2.length;
		boolean[][] dp = new boolean[n + 1][m + 1];
		dp[0][0] = true;
		for (int i = 1; i <= n; i++) {
			if (s1[i - 1] != s3[i - 1]) {
				break;
			}
			dp[i][0] = true;
		}

		for (int j = 1; j <= m; j++) {
			if (s2[j - 1] != s3[j - 1]) {
				break;
			}
			dp[0][j] = true;
		}

		for (int i = 1; i <= n; i ++) {
			for (int j = 1; j <= m; j ++) {
				dp[i][j] = (s1[i - 1] == s3[i + j - 1] && dp[i - 1][j]) || (s2[j - 1] == s3[i + j - 1] && dp[i][j - 1]);
			}
		}
		return dp[n][m];
	}

	/**
	 * solution3: dp + space compression
	 * @param str1
	 * @param str2
	 * @param str3
	 * @return
	 */
	public boolean isInterleave3(String str1, String str2, String str3) {
		if (str1.length() + str2.length() != str3.length()) return false;

		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		char[] s3 = str3.toCharArray();

		int n = s1.length, m = s2.length;
		boolean[] dp = new boolean[m + 1];
		dp[0] = true;

		for (int j = 1; j <= m; j++) {
			if (s2[j - 1] != s3[j - 1]) {
				break;
			}
			dp[j] = true;
		}

		for (int i = 1; i <= n; i ++) {
			dp[0] = s1[i - 1] == s3[i - 1] && dp[0];
			for (int j = 1; j <= m; j ++) {
				dp[j] = (s1[i - 1] == s3[i + j - 1] && dp[j]) || (s2[j - 1] == s3[i + j - 1] && dp[j - 1]);
			}
		}
		return dp[m];
	}
}