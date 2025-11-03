package com.cy.leetcodeplay.graph.no827;

/**
 * @Author: Lil-K
 * @Date: 2025/11/3
 * @Description: no.827. Making A Large Island
 * link: https://leetcode.com/problems/making-a-large-island/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: flood fill
	 * @param grid
	 * @return
	 */
	public int largestIsland(int[][] grid) {
		int n = grid.length, m = grid[0].length;
		if (n == 1 || m == 1) return 1;

		/**
		 * 1. 将每个孤立的岛编号, id 从 2 开始
		 * 2. 统计每个岛的数量
		 * 3. 讨论每个 0 的上下左右位置是否联通
		 * 4. 计算最大值
		 */
		int id = 2;
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				if (grid[i][j] == 1) {
					dfs(grid, n, m, id, i, j);
					id ++;
				}
			}
		}

		int[] size = new int[id];
		int ans = 0;
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				if (grid[i][j] > 1) {
					// size[grid[i][j]] ++;
					ans = Math.max(ans, ++ size[grid[i][j]]);
				}
			}
		}

		// 讨论 每个 0 位置的上下左右关系
		boolean[] visited = new boolean[id];
		int up, right, down, left, merge;

		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				if (grid[i][j] != 0) continue;

				up = i > 0 ? grid[i - 1][j] : 0;
				down = i + 1 < n ? grid[i + 1][j] : 0;
				right = j + 1 < m ? grid[i][j + 1] : 0;
				left = j > 0 ? grid[i][j - 1] : 0;

				// 记录 当前 grid[i][j] == 0 的位置的上下左右, 被访问过的格子不能重复计算
				visited[up] = true;
				merge = 1 + size[up];

				if (!visited[right]) {
					merge += size[right];
					visited[right] = true;
				}

				if (!visited[down]) {
					merge += size[down];
					visited[down] = true;
				}

				if (!visited[left]) {
					merge += size[left];
					visited[left] = true;
				}
				ans = Math.max(ans, merge);

				visited[up] = visited[right] = visited[down] = visited[left] = false;
			}
		}

		return ans;
	}

	private void dfs(int[][] grid, int n, int m, int id, int i, int j) {
		if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] != 1) return;
		grid[i][j] = id;
		dfs(grid, n, m, id, i - 1, j);
		dfs(grid, n, m, id, i + 1, j);
		dfs(grid, n, m, id, i, j - 1);
		dfs(grid, n, m, id, i, j + 1);
	}
}
