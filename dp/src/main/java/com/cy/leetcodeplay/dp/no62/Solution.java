package com.cy.leetcodeplay.dp.no62;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/16
 * @Description: no.62. Unique Paths
 * link: https://leetcode.com/problems/unique-paths/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param m
	 * @param n
	 * @return
	 */
	public int uniquePaths(int m, int n) {
		return f1(m, n, m - 1, n - 1);
	}

	private int f1(int m, int n, int row, int col) {
		if (row == 0 || col == 0) {
			return 1;
		}
		int ans = 0;
		// down way not
		if (row - 1 >= 0) {
			ans += f1(m, n, row - 1, col);
		}

		// right way not
		if (col - 1 >= 0) {
			ans += f1(m, n, row, col - 1);
		}

		return ans;
	}

	/**
	 * solution2: recursive + memory search
	 * @param m
	 * @param n
	 * @return
	 */
	public int uniquePaths2(int m, int n) {
		int[][] dp = new int[m][n];
		return f2(m, n, m - 1, n - 1, dp);
	}

	private int f2(int m, int n, int row, int col, int[][] dp) {
		if (row == 0 || col == 0) {
			return 1;
		}

		if (dp[row][col] != 0) {
			return dp[row][col];
		}

		int ans = f2(m, n, row - 1, col, dp) + f2(m, n, row, col - 1, dp);
		dp[row][col] = ans;
		return ans;
	}

	/**
	 * solution3: dp
	 * @param m
	 * @param n
	 * @return
	 */
	public int uniquePaths3(int m, int n) {
		int[][] dp = new int[m][n];
		Arrays.fill(dp[0], 1);
		for (int i = 0; i < m; i ++) {
			dp[i][0] = 1;
		}

		for (int i = 1; i < m; i ++) {
			for (int j = 1; j < n; j ++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}
		return dp[m - 1][n - 1];
	}

	/**
	 * solution4: dp + space compression
	 * @param m
	 * @param n
	 * @return
	 */
	public int uniquePaths4(int m, int n) {
		int[] dp = new int[n];
		Arrays.fill(dp, 1);

		for (int i = 1; i < m; i ++) {
			for (int j = 1; j < n; j ++) {
				dp[j] = dp[j - 1] + dp[j];
			}
		}
		return dp[n - 1];
	}
}