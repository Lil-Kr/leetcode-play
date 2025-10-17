package com.cy.leetcodeplay.dp2.noself.no1;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/17
 * @Description:
 * 题目: 给定两个字符串 s1 和 s2,
 * 问: s1 至少删除多少个字符可以成为 s2 的子串(不是子序列)
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param str1
	 * @param str2
	 * @return
	 */
	public int delete(String str1, String str2) {
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();

		int n = s1.length, m = s2.length;
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i ++) {
			Arrays.fill(dp[i], -1);
		}

		int res = f1(s1, s2, n, m, dp);
		return n - res;
	}

	private int f1(char[] s1, char[] s2, int i, int j, int[][] dp) {
		if (i == 0 || j == 0) return 0;
		if (dp[i][j] != -1) return dp[i][j];

		int ans;
		if (s1[i - 1] == s2[j - 1]) {
			ans = 1 + f1(s1, s2, i - 1, j - 1, dp);
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
	public int delete2(String str1, String str2) {
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();

		int n = s1.length, m = s2.length;
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i <= n; i ++) {
			dp[i][0] = i;
			for (int j = 1; j <= m; j ++) {
				if (s1[i - 1] == s2[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = dp[i - 1][j] + 1;
				}
			}
		}
		int ans = Integer.MAX_VALUE;
		for (int j = 0; j <= m; j ++) {
			ans = Math.min(ans, dp[n][j]);
		}
		return ans;
	}
}