package com.cy.leetcodeplay.dp.no329;

/**
 * @Author: Lil-K
 * @Date: 2025/9/12
 * @Description: no.329. Longest Increasing Path in a Matrix
 * link: https://leetcode.com/problems/longest-increasing-path-in-a-matrix/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param matrix
	 * @return
	 */
	public int longestIncreasingPath(int[][] matrix) {
		int n = matrix.length, m = matrix[0].length;

		int ans = 0;
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				ans = Math.max(ans, f1(matrix, i, j));
			}
		}
		return ans;
	}

	private int f1(int[][] matrix, int i, int j) {
		int next = 0;
		/**
		 * top position have element
		 */
		if (i > 0 && matrix[i][j] < matrix[i - 1][j]) {
			next = Math.max(next, f1(matrix, i - 1, j));
		}

		/**
		 * down position have element
		 */
		if (i < matrix.length - 1 && matrix[i][j] < matrix[i + 1][j]) {
			next = Math.max(next, f1(matrix, i + 1, j));
		}

		/**
		 * left position have element
		 */
		if (j > 0 && matrix[i][j] < matrix[i][j - 1]) {
			next = Math.max(next, f1(matrix, i, j - 1));
		}

		/**
		 * right position have element
		 */
		if (j < matrix[0].length - 1 && matrix[i][j] < matrix[i][j + 1]) {
			next = Math.max(next, f1(matrix, i, j + 1));
		}
		return next + 1;
	}

	/**
	 * solution2: recursive + memory search
	 * @param matrix
	 * @return
	 */
	public int longestIncreasingPath2(int[][] matrix) {
		int n = matrix.length, m = matrix[0].length;
		int[][] dp = new int[n][m];

		int ans = 0;
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				ans = Math.max(ans, f2(matrix, i, j, dp));
			}
		}
		return ans;
	}

	private int f2(int[][] matrix, int i, int j, int[][] dp) {
		if (dp[i][j] != 0) {
			return dp[i][j];
		}

		int next = 0;
		/**
		 * top position have element
		 */
		if (i > 0 && matrix[i][j] < matrix[i - 1][j]) {
			next = Math.max(next, f2(matrix, i - 1, j, dp));
		}

		/**
		 * down position have element
		 */
		if (i < matrix.length - 1 && matrix[i][j] < matrix[i + 1][j]) {
			next = Math.max(next, f2(matrix, i + 1, j, dp));
		}

		/**
		 * left position have element
		 */
		if (j > 0 && matrix[i][j] < matrix[i][j - 1]) {
			next = Math.max(next, f2(matrix, i, j - 1, dp));
		}

		/**
		 * right position have element
		 */
		if (j < matrix[0].length - 1 && matrix[i][j] < matrix[i][j + 1]) {
			next = Math.max(next, f2(matrix, i, j + 1, dp));
		}

		dp[i][j] = next + 1;
		return dp[i][j];
	}
}