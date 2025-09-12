package com.cy.leetcodeplay.dp.no516;

/**
 * @Author: Lil-K
 * @Date: 2024/12/6
 * @Description: no.516. Longest Palindromic Subsequence
 * link: https://leetcode.com/problems/longest-palindromic-subsequence/
 *
 * todo: 未录入Anki
 *
 * 最长回文子序列问题:
 *  1. 将字符串逆序
 *  2. 可以转化为最长公共子序列问题
 *  3. 本题使用区间动态规划的思路
 */
public class Solution {

	/**
	 * 解法一: 暴力递归
	 * @param s
	 * @return
	 */
	public int longestPalindromeSubSeq(String s) {
		char[] chs = s.toCharArray();
		int n = chs.length;

		// 从索引开始
		return f1(chs, 0, n - 1);
	}

	/**
	 * chs[l ... r] 最长回文子序列的长度
	 * l <= r
	 */
	private int f1(char[] s, int l, int r) {
		/**
		 * 只有一个字符的case
		 */
		if (l == r) {
			return 1;
		}
		/**
		 * 只有两个字符的case
		 */
		if (l + 1 == r) {
			return s[l] == s[r] ? 2 : 1;
		}

		if (s[l] == s[r]) {
			return 2 + f1(s, l + 1, r - 1);
		} else {
			return Math.max(f1(s, l + 1, r), f1(s, l, r - 1));
		}
	}

	/**
	 * 解法二: 记忆化搜索
	 * @param s
	 * @return
	 */
	public int longestPalindromeSubSeq2(String s) {
		char[] chs = s.toCharArray();
		int n = chs.length;

		int[][] dp = new int[n][n];

		// 从索引开始
		return f2(chs, 0, n - 1, dp);
	}

	private int f2(char[] s, int l, int r, int[][] dp) {
		if (l == r) return 1;

		if (l + 1 == r) return s[l] == s[r] ? 2 : 1;

		if (dp[l][r] != 0) return dp[l][r];

		int ans;
		if (s[l] == s[r]) {
			ans = 2 + f2(s, l + 1, r - 1, dp);
		} else {
			ans = Math.max(f2(s, l + 1, r, dp), f2(s, l, r - 1, dp));
		}
		dp[l][r] = ans;
		return ans;
	}

	/**
	 * 解法三: 严格位置依赖的动态规划
	 * l <= r : 矩阵格子中, l 一侧的格子是作废的
	 */
	public int longestPalindromeSubSeq3(String s) {
		char[] chs = s.toCharArray();
		int n = chs.length;

		int[][] dp = new int[n][n];

		for (int l = n - 1; l >= 0; l--) {
			/**
			 * 行列表达: n - 1, 这个格子只需要填 1
			 */
			dp[l][l] = 1;

			if (l + 1 < n) {
				dp[l][l + 1] = chs[l] == chs[l + 1] ? 2 : 1;
			}

			for (int r = l + 2; r < n; r++) {
				if (chs[l] == chs[r]) {
					dp[l][r] = 2 + dp[l + 1][r - 1];
				} else {
					dp[l][r] = Math.max(dp[l + 1][r], dp[l][r - 1]);
				}
			}
		}
		return dp[0][n - 1];
	}

	/**
	 * 解法四: dp的空间优化
	 * 用一维数组滚动更新
	 * @param str
	 * @return
	 */
	public int longestPalindromeSubSeq4(String str) {
		char[] s = str.toCharArray();
		int n = s.length;
		int[] dp = new int[n];
		for (int l = n - 1, leftDown = 0, backup; l >= 0; l--) {
			dp[l] = 1;
			if (l + 1 < n) {
				leftDown = dp[l + 1];
				dp[l + 1] = s[l] == s[l + 1] ? 2 : 1;
			}
			for (int r = l + 2; r < n; r ++) {
				backup = dp[r];
				if (s[l] == s[r]) {
					dp[r] = 2 + leftDown;
				} else {
					dp[r] = Math.max(dp[r], dp[r - 1]);
				}
				leftDown = backup;
			}
		}
		return dp[n - 1];
	}
}