package com.cy.leetcodeplay.matrix.graph.no200;

/**
 * @Author: Lil-K
 * @Date: 2024/10/29
 * @Description: no.200. Number of Islands
 * todo: 未录入题库
 *
 * flood fill 算法
 *
 * 广度优先(BFS) 或者 深度优先(DFS)
 */
public class Solution {

	private int[][] direction = {{-1,0},{0,1},{1,0},{0,-1}};
	private int rows, cols;
	private boolean[][] visited;

	/**
	 *
	 * @param grid
	 * @return
	 */
	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
		rows = grid.length;
		cols = grid[0].length;

		/**
		 * 初始化 visited
		 */
		visited = new boolean[rows][cols];
		int numIslands = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == '1' && !visited[i][j]) {
					numIslands++;
					/**
					 * 标记周围的数字: visited[i][j] = true;
					 * 这里保证了
					 */
					dfs(grid, i, j);
				}
			}
		}

		return numIslands;
	}

	/**
	 * 从 [x, y]的位置进行 flood fill 算法
	 * @param grid
	 * @param x
	 * @param y
	 */
	private void dfs(char[][] grid, int x, int y) {
		visited[x][y] = true;

		/**
		 * 从[x, y]开始, 向它的四个方向扩散, 并标记
		 */
		for (int i = 0; i < 4; i++) {
			int newx = x + direction[i][0];
			int newy = y + direction[i][1];

			if (inArea(newx, newy) && !visited[newx][newy] && grid[newx][newy] == '1') {
				dfs(grid, newx, newy);
			}
		}
	}

	/**
	 *
	 * @param x
	 * @param y
	 * @return
	 */
	private boolean inArea(int x, int y) {
		return x >= 0 && x < rows && y >= 0 && y < cols;
	}
}
