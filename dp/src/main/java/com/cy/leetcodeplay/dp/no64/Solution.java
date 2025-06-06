package com.cy.leetcodeplay.dp.no64;

/**
 * @Author: Lil-K
 * @Date: 2024/12/6
 * @Description: no.64. Minimum Path Sum
 * link: https://leetcode.com/problems/minimum-path-sum/description/
 *
 * todo: 未录入题库
 *
 * 每一步都只能向右或者向下走
 */
public class Solution {

	/**
	 * 解法一: 纯递归
	 * @param grid
	 * @return
	 */
	public int minPathSum(int[][] grid) {
		return f1(grid, grid.length - 1, grid[0].length - 1);
	}

	private int f1(int[][] grid, int i, int j) {
		if (i == 0 && j == 0) return grid[i][j];

		int up = Integer.MAX_VALUE;
		int left = Integer.MAX_VALUE;

		if (i > 0) {
			up = f1(grid, i - 1, j);
		}
		if (j > 0) {
			left = f1(grid, i, j - 1);
		}
		return grid[i][j] + Math.min(up, left);
	}

	/**
	 * 解法二: 记忆化搜索 + 递归
	 * 从顶到底
	 * @param grid
	 * @return
	 */
	public int minPathSum2(int[][] grid) {
		/**
		 * 需要一个 n * m 大小的dp表
		 */
		int n = grid.length, m = grid[0].length;
		int[][] dp = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				dp[i][j] = -1;
			}
		}

		return f2(grid, grid.length - 1, grid[0].length - 1, dp);
	}

	private int f2(int[][] grid, int i, int j, int[][] dp) {
		if(dp[i][j] != -1) return dp[i][j];

		int ans;
		if (i == 0 && j == 0) {
			ans = grid[i][j];
		} else {
			int up = Integer.MAX_VALUE;
			int left = Integer.MAX_VALUE;
			if (i > 0) {
				up = f2(grid, i - 1, j, dp);
			}
			if (j > 0) {
				left = f2(grid, i, j - 1, dp);
			}
			ans = grid[i][j] + Math.min(up, left);
		}
		dp[i][j] = ans;
		return ans;
	}

	/**
	 * 解法三: 严格位置依赖的动态规划
	 * @param grid
	 * @return
	 */
	public int minPathSum3(int[][] grid) {
		int n = grid.length, m = grid[0].length;
		int[][] dp = new int[n][m];
		dp[0][0] = grid[0][0];

		for (int i = 1; i < n; i++) {
			dp[i][0] = dp[i - 1][0] + grid[i][0];
		}

		for (int j = 1; j < m; j++) {
			dp[0][j] = dp[0][j - 1] + grid[0][j];
		}

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
			}
		}
		return dp[n - 1][m - 1];
	}

	/**
	 * 严格位置以来的动态规划 + 空间压缩技巧
	 * @param grid
	 * @return
	 */
	public int minPathSum4(int[][] grid) {
		int n = grid.length, m = grid[0].length;
		int[] dp = new int[m];
		dp[0] = grid[0][0];
		for (int i = 1; i < m; i++) {
			dp[i] = dp[i - 1] + grid[0][i];
		}

		for (int i = 1; i < n; i++) {
			dp[0] += grid[i][0];
			for (int j = 1; j < m; j++) {
				dp[j] = Math.min(dp[j - 1], dp[j]) + grid[i][j];
			}
		}
		return dp[m - 1];
	}
}