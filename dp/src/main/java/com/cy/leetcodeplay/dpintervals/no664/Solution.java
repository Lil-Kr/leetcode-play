package com.cy.leetcodeplay.dpintervals.no664;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/3
 * @Description: no.664. Strange Printer
 * link: https://leetcode.com/problems/strange-printer/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param str
	 * @return
	 */
	public int strangePrinter(String str) {
		char[] s = str.toCharArray();
		int n = s.length;
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i ++) {
			Arrays.fill(dp[i], -1);
		}
		return f1(s, 0, n - 1, dp);
	}

	// s[l .. r] 至少打印几次
	private int f1(char[] s, int l, int r, int[][] dp) {
		// s[l ... r] --> "a"
		if (l == r) return 1;

		// s[l ... r]  --> "aa", "ab"
		if (l == r - 1) {
			if (s[l] == s[r]) {
				return 1;
			} else {
				return 2;
			}
		}

		if (dp[l][r] != -1) {
			return dp[l][r];
		}

		// s[l ... r]  --> r - l >= 2
		int ans = Integer.MAX_VALUE;
		if (s[l] == s[r]) {
			ans = f1(s, l, r - 1, dp);
		} else {
			for (int mid = l; mid < r; mid ++) {
				ans = Math.min(ans, f1(s, l, mid, dp) + f1(s, mid + 1, r, dp));
			}
		}
		dp[l][r] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * @param str
	 * @return
	 */
	public int strangePrinter2(String str) {
		char[] s = str.toCharArray();
		int n = s.length;

		int[][] dp = new int[n][n];
		dp[n - 1][n - 1] = 1;
		for (int l = 0; l < n - 1; l ++) {
			dp[l][l] = 1;
			dp[l][l + 1] = s[l] == s[l + 1] ? 1 : 2;
		}

		for (int l = n - 3, ans; l >= 0; l --) {
			for (int r = l + 2; r < n; r ++) {
				if (s[l] == s[r]) {
					dp[l][r] = dp[l][r - 1];
					// dp[l][r] = dp[l + 1][r]
				} else {
					ans = Integer.MAX_VALUE;
					for (int m = l; m < r; m ++) {
						ans = Math.min(ans, dp[l][m] + dp[m + 1][r]);
					}
					dp[l][r] = ans;
				}
			}
		}
		return dp[0][n - 1];
	}
}