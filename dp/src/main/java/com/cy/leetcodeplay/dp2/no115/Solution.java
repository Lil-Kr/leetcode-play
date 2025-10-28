package com.cy.leetcodeplay.dp2.no115;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/14
 * @Description: no.115. Distinct Subsequences
 * link: https://leetcode.com/problems/distinct-subsequences/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param s
	 * @param t
	 * @return
	 */
	public int numDistinct(String s, String t) {
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();

		int n = s1.length, m = t1.length;
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i ++) {
			Arrays.fill(dp[i], -1);
		}
		return f1(s1, t1, n, m, dp);
	}

	private int f1(char[] s1, char[] t1, int i, int j, int[][] dp) {
		if (dp[i][j] != -1) return dp[i][j];
		/**
		 * base case 的顺序不能调换, 必须先判断 j == 0
		 * 因为 j == 0 的含义更具体, 更有意义, 表示: t 为字符串时: "", 无论 s 中还剩多少个字符, 都为 1 个
		 */
		if (j == 0) return 1;
		if (i == 0) return 0;


		int ans = f1(s1, t1, i - 1, j, dp);
		if (s1[i - 1] == t1[j - 1]) {
			ans += f1(s1, t1, i - 1, j - 1, dp);
		}
		dp[i][j] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * O(n * m)
	 * @param str
	 * @param target
	 * @return
	 */
	public int numDistinct2(String str, String target) {
		char[] s = str.toCharArray();
		char[] t = target.toCharArray();
		int n = s.length, m = t.length;

		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			dp[i][0] = 1;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j ++) {
				dp[i][j] = dp[i - 1][j];
				if (s[i - 1] == t[j - 1]) {
					dp[i][j] += dp[i - 1][j - 1];
				}
			}
		}
		return dp[n][m];
	}

	/**
	 * solution3: dp + space compression
	 * O(n * m)
	 * @param str
	 * @param target
	 * @return
	 */
	public int numDistinct3(String str, String target) {
		char[] s = str.toCharArray();
		char[] t = target.toCharArray();
		int n = s.length, m = t.length;

		int[] dp = new int[m + 1];
		dp[0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = m; j >= 1; j--) {
				if (s[i - 1] == t[j - 1]) {
					dp[j] += dp[j - 1];
				}
			}
		}
		return dp[m];
	}
}