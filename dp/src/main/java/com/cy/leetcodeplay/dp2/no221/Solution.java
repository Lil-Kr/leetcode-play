package com.cy.leetcodeplay.dp2.no221;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/28
 * @Description: no.221. Maximal Square
 * link: https://leetcode.com/problems/maximal-square/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param matrix
	 * @return
	 */
	public int maximalSquare(char[][] matrix) {
		int n = matrix.length, m = matrix[0].length;

		int[][] dp = new int[n][m];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dp[i], -1);
		}

		int maxLen = 0;
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				maxLen = Math.max(maxLen, f1(matrix, i, j, dp));
			}
		}
		return (int)Math.pow(maxLen, 2);
	}

	private int f1(char[][] matrix, int row, int col, int[][] dp) {
		if (row < 0 || col < 0) {
			return 0;
		}

		// 当前位置不合法, 则跳过
		if (matrix[row][col] == '0') {
			return 0;
		}

		if (dp[row][col] != -1) {
			return dp[row][col];
		}

		// up
		int up = f1(matrix, row - 1, col, dp);

		// left
		int left = f1(matrix, row, col - 1, dp);

		// diag
		int diag = f1(matrix, row - 1, col - 1, dp);

		dp[row][col] = Math.min(up, Math.min(left, diag)) + 1;

		return dp[row][col];
	}

	/**
	 * solution2: dp
	 * this way will be runtime fast
	 * @param matrix
	 * @return
	 */
	public int maximalSquare2(char[][] matrix) {
		int n = matrix.length, m = matrix[0].length;

		int[][] dp = new int[n][m];
		int maxLen = 0;
		// 初始化第一行
		for (int j = 0; j < m; j ++) {
			dp[0][j] = matrix[0][j] == '1' ? 1 : 0;
			maxLen = Math.max(maxLen, dp[0][j]);
		}
		// 初始化第一列
		for (int i = 0; i < n; i++) {
			dp[i][0] = matrix[i][0] == '1' ? 1 : 0;
			maxLen = Math.max(maxLen, dp[i][0]);
		}

		for (int i = 1; i < n; i ++) {
			for (int j = 1; j < m; j ++) {
				if (matrix[i][j] == '0') {
					dp[i][j] = 0;
					continue;
				}
				dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
				maxLen = Math.max(maxLen, dp[i][j]);
			}
		}
		return (int)Math.pow(maxLen, 2);
	}

	/**
	 * solution2: dp
	 * different way
	 * @param matrix
	 * @return
	 */
	public int maximalSquare3(char[][] matrix) {
		int n = matrix.length, m = matrix[0].length;

		int[][] dp = new int[n][m];

		int maxLen = 0;
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				if (matrix[i][j] == '0') {
					dp[i][j] = 0;
					continue;
				}
				if (i == 0 || j == 0) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
				}
				maxLen = Math.max(maxLen, dp[i][j]);
			}
		}
		return (int)Math.pow(maxLen, 2);
	}
}