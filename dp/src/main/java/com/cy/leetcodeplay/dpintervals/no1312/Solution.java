package com.cy.leetcodeplay.dpintervals.no1312;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/30
 * @Description: no.1312. Minimum Insertion Steps to Make a String Palindrome
 * link: https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param str
	 * @return
	 */
	public int minInsertions(String str) {
		char[] s = str.toCharArray();
		int n = s.length;
		int[][] dp = new int[n][n];
		for (int i = 0; i < n; i ++) {
			Arrays.fill(dp[i], -1);
		}
		return f1(s, 0, n - 1, dp);
	}

	/**
	 * s[l ... r] the substring within the range is transformed into a palindrome
	 * return: how many times need to insert at least
	 */
	private int f1(char[] s, int l, int r, int[][] dp) {
		if (dp[l][r] != -1) {
			return dp[l][r];
		}

		if (l == r) {
			return 0;
		}

		if (l + 1 == r) {
			return s[l] == s[r] ? 0 : 1;
		}

		int ans;
		if (s[l] == s[r]) {
			ans = f1(s, l + 1, r - 1, dp);
		} else {
			ans = Math.min(f1(s, l + 1, r, dp), f1(s, l, r - 1, dp)) + 1;
		}
		dp[l][r] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * @param str
	 * @return
	 */
	public int minInsertions2(String str) {
		char[] s = str.toCharArray();
		int n = s.length;
		int[][] dp = new int[n][n];
		/**
		 * initial:
		 *  dp[0][0] = 0;
		 *  dp[1][1] = 0;
		 *  dp[i][i] = 0;
		 *
		 * dp[0][1] = ?
		 * dp[1][2] = ?
		 * dp[n - 2][n - 1] = ?
		 */
		for (int l = 0; l < n - 1; l ++) {
			dp[l][l + 1] = s[l] == s[l + 1] ? 0 : 1;
		}

		for (int l = n - 3; l >= 0; l --) {
			for (int r = l + 2; r < n; r ++) {
				if (s[l] == s[r]) {
					dp[l][r] = dp[l + 1][r - 1];
				} else {
					dp[l][r] = Math.min(dp[l + 1][r], dp[l][r - 1]) + 1;
				}
			}
		}
		return dp[0][n - 1];
	}

	/**
	 * solution3: dp + space compression
	 * @param str
	 * @return
	 */
	public int minInsertions3(String str) {
		char[] s = str.toCharArray();
		int n = s.length;
		if (n < 2) {
			return 0;
		}

		int[] dp = new int[n];
		dp[n - 1] = s[n - 2] == s[n - 1] ? 0 : 1;

		for (int l = n - 3, leftDown, backUp; l >= 0; l --) {
			leftDown = dp[l + 1];
			dp[l + 1] = s[l] == s[l + 1] ? 0 : 1;
			for (int r = l + 2; r < n; r ++) {
				backUp = dp[r];
				if (s[l] == s[r]) {
					dp[r] = leftDown;
				} else {
					dp[r] = Math.min(dp[r - 1], dp[r]) + 1;
				}
				leftDown = backUp;
			}
		}
		return dp[n - 1];
	}

}