package com.cy.leetcodeplay.dp2.no63;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/9/27
 * @Description: no.63. Unique Paths II
 * link: https://leetcode.com/problems/unique-paths-ii/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive + memory search
	 * @param obstacleGrid
	 * @return
	 */
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int n = obstacleGrid.length, m = obstacleGrid[0].length;

		int[][] dp = new int[n][m];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dp[i], -1);
		}
		return f1(obstacleGrid, n - 1, m - 1, dp);
	}

	private int f1(int[][] obstacleGrid, int row, int col, int[][] dp) {
		if (row < 0 || col < 0) return 0;

		// 遇到障碍物
		if (obstacleGrid[row][col] == 1) return 0;

		// 到达起点
		if (row == 0 && col == 0) return 1;

		if (dp[row][col] != -1) {
			return dp[row][col];
		}

		int up = f1(obstacleGrid, row - 1, col, dp);
		int left = f1(obstacleGrid, row, col - 1, dp);

		dp[row][col] = up + left;
		return dp[row][col];
	}

	/**
	 * solution2: dp
	 * dp[i][i] 表示 从起点(0,0) 达到(i, j) 的路径数量
	 * dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
	 * 初始化dp表比较复杂
	 * @param obstacleGrid
	 * @return
	 */
	public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
		// 起点有障碍，直接返回 0
		if (obstacleGrid[0][0] == 1) return 0;

		int n = obstacleGrid.length, m = obstacleGrid[0].length;
		int[][] dp = new int[n][m];
		dp[0][0] = 1;

		// 初始化第一列
		for (int i = 1; i < n; i++) {
			if (obstacleGrid[i][0] == 0 && dp[i - 1][0] == 1) {
				dp[i][0] = 1;
			} else {
				dp[i][0] = 0; // 有障碍或前面已被阻塞
			}
		}

		// 初始化第一行
		for (int j = 1; j < m; j++) {
			if (obstacleGrid[0][j] == 0 && dp[0][j - 1] == 1) {
				dp[0][j] = 1;
			} else {
				dp[0][j] = 0;
			}
		}

		// 状态转移
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (obstacleGrid[i][j] == 1) {
					dp[i][j] = 0;
				} else {
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}
			}
		}
		return dp[n - 1][m - 1];
	}
}