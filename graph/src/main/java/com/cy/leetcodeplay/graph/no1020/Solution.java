package com.cy.leetcodeplay.graph.no1020;

/**
 * @Author: Lil-K
 * @Date: 2025/11/3
 * @Description: no.1020. Number of Enclaves
 * link: https://leetcode.com/problems/number-of-enclaves/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: flood fill
	 * @param grid
	 * @return
	 */
	public int numEnclaves(int[][] grid) {
		int n = grid.length, m = grid[0].length;
		if (n <= 1 || m <= 1) return 0;

		boolean[][] visited = new boolean[n][m];
		/**
		 * 先找出 与 外层 1 相连的内层 1, 包含外层 1, 并标记
		 * 行列都同时进行
		 */
		for (int i = 0; i < n; i ++) {
			dfs(grid, n, m, visited, i, 0);
			dfs(grid, n, m, visited, i, m - 1);
		}

		for (int j = 0; j < m; j++) {
			dfs(grid, n, m, visited, 0, j);
			dfs(grid, n, m, visited, n - 1, j);
		}

		// 最后统计内存为标记的 1
		int ans = 0;
		for (int i = 1; i < n - 1; i ++) {
			for (int j = 1; j < m - 1; j ++) {
				if (!visited[i][j] && grid[i][j] == 1) {
					ans ++;
				}
			}
		}
		return ans;
	}

	private void dfs(int[][] grid, int n, int m, boolean[][] visited, int i, int j) {
		if (i < 0 || i >= n || j < 0 || j >= m || visited[i][j] || grid[i][j] == 0) {
			return;
		}
		visited[i][j] = true;
		dfs(grid, n, m, visited, i - 1, j);
		dfs(grid, n, m, visited, i + 1, j);
		dfs(grid, n, m, visited, i, j - 1);
		dfs(grid, n, m, visited, i, j + 1);
	}
}