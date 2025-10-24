package com.cy.leetcodeplay.dpgroupallpackage.no474;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/24
 * @Description: no.474. Ones and Zeroes
 * link: https://leetcode.com/problems/ones-and-zeroes/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param strs
	 * @param m
	 * @param n
	 * @return
	 */
	public int findMaxForm(String[] strs, int m, int n) {
		int len = strs.length;
		int[][][] dp = new int[len + 1][m + 1][n + 1];
		for (int i = 0; i <= len; i ++) {
			for (int j = 0; j <= m; j ++) {
				Arrays.fill(dp[i][j], -1);
			}
		}
		return f1(strs, len, 0, m, n, dp);
	}

	private int f1(String[] strs, int len, int index, int m, int n, int[][][] dp) {
		if (index == len) return 0;

		if (dp[index][m][n] != -1) return dp[index][m][n];

		int one = 0, zero = 0;
		char[] chars = strs[index].toCharArray();
		for (char c : chars) {
			if (c == '1') {
				one ++;
			} else {
				zero ++;
			}
		}

		int ans = f1(strs, len, index + 1, m, n, dp);
		if (m >= zero && n >= one) {
			ans = Math.max(ans, 1 + f1(strs, len, index + 1, m - zero, n - one, dp));
		}
		dp[len][m][n] = ans;
		return ans;
	}

	/**
	 * solution2: dp
	 * @param strs
	 * @param m
	 * @param n
	 * @return
	 */
	public int findMaxForm2(String[] strs, int m, int n) {
		int[][] dp = new int[m + 1][n + 1];

		for (String s : strs) {
			int zero = 0, one = 0;
			for (char c : s.toCharArray()) {
				if (c == '0') zero++;
				else one++;
			}

			/**
			 * 必须从大到小遍历, 防止重复选择
			 * dp[][]
			 */
			for (int i = m; i >= zero; i--) {
				for (int j = n; j >= one; j--) {
					dp[i][j] = Math.max(dp[i][j], dp[i - zero][j - one] + 1);
				}
			}
		}
		return dp[m][n];
	}
}