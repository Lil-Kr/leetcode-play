package com.cy.leetcodeplay.dpintervals.no730;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/4
 * @Description: no.730. Count Different Palindromic Subsequences
 * link: https://leetcode.com/problems/count-different-palindromic-subsequences/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	private static int MOD = (int)Math.pow(10, 9) + 7;

	/**
	 * solution1: recursive
	 * @param str
	 * @return
	 */
	public int countPalindromicSubsequences(String str) {
		int n = str.length();
		char[] s = str.toCharArray();

		// 上一次出现的位置
		int[] last = new int[256];

		// left[i] : i 位置的左边和s[i]字符相等且最近的位置在哪, 不存在就是-1
		Arrays.fill(last, -1);
		int[] left = new int[n];
		for (int i = 0; i < n; i ++) {
			left[i] = last[s[i]];
			last[s[i]] = i;
		}

		// right[j]: j 位置的右边和s[i]字符相等且最近的位置在哪, 不存在就是-1
		Arrays.fill(last, n);
		int[] right = new int[n];
		for (int i = n - 1; i >= 0; i --) {
			right[i] = last[s[i]];
			last[s[i]] = i;
		}

		long[][] dp = new long[n][n];
		for (int i = 0; i < n; i ++) {
			dp[i][i] = 1;
		}

		for (int i = n - 2, l, r; i >= 0; i --) {
			for (int j = i + 1; j < n; j ++) {
				if (s[i] != s[j]) {
					dp[i][j] = dp[i][j - 1] + dp[i + 1][j] - dp[i + 1][j - 1] + MOD;
				} else {
					/**
					 * a ... a
					 * i ... j
					 */
					l = right[i];
					r = left[j];
					if (l > r) {
						// s[i ... j] 的内部没有 s[i] 字符
						dp[i][j] = dp[i + 1][j - 1] * 2 + 2;
					} else if (l == r) {
						// s[i ... j] 的内部只有一个 s[i] 字符
						dp[i][j] = dp[i + 1][j - 1] * 2 + 1;
					} else {
						// 取模, 只要发生减操作就 + MOD, 同余远离
						dp[i][j] = dp[i + 1][j - 1] * 2 - dp[l + 1][r - 1] + MOD;
					}
				}
				dp[i][j] %= MOD;
			}
		}
		return (int)dp[0][n - 1];
	}
}