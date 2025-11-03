package com.cy.leetcodeplay.graph.no695;

import java.util.TreeSet;

/**
 * @Author: Lil-K
 * @Date: 2025/11/3
 * @Description: no.695. Max Area of Island
 * link: https://leetcode.com/problems/max-area-of-island/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	private int R, C;
	private int[][] grid;
	private TreeSet<Integer>[] G;
	private int[][] direction = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
	private boolean[] visited;

	/**
	 * solution1: Graph
	 * @param grid
	 * @return
	 */
	public int maxAreaOfIsland(int[][] grid) {
		if (grid == null) return 0;

		R = grid.length;
		if (R == 0) return 0;

		C = grid[0].length;
		if (C == 0) return 0;

		this.grid = grid;
		G = buildGraph();

		int res = 0;
		this.visited = new boolean[G.length];
		for (int v = 0; v < G.length; v ++) {
			int x = v / C, y = v % C;
			if (!visited[v] && grid[x][y] == 1) {
				res = Math.max(res, dfs(v));
			}
		}
		return res;
	}

	private int dfs(int v) {
		visited[v] = true;
		int res = 1;
		for (int w : G[v]) {
			if (!visited[w]) {
				res += dfs(w);
			}
		}
		return res;
	}

	private TreeSet<Integer>[] buildGraph() {
		TreeSet<Integer>[] graph = new TreeSet[R * C];
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new TreeSet<>();
		}

		for (int v = 0; v < graph.length; v ++) {
			int x = v / C, y = v % C;
			if (grid[x][y] != 1) continue;

			for (int i = 0; i < direction.length; i ++) {
				int nextX = x + direction[i][0], nextY = y + direction[i][1];
				if (!inArea(nextX, nextY) || grid[nextX][nextY] != 1) continue;
				/**
				 * 二维坐标 转为 一维坐标, 构建边的关系
				 * 边连接相邻的两个顶点
				 */
				int next = nextX * C + nextY;
				graph[v].add(next);
				graph[next].add(v);
			}
		}
		return graph;
	}

	private boolean inArea(int x, int y) {
		return x >= 0 && x < R && y >= 0 && y < C;
	}


	private boolean[][] visited2;
	/**
	 * solution2: floodfill
	 * @param grid
	 * @return
	 */
	public int maxAreaOfIsland2(int[][] grid) {
		if (grid == null) return 0;
		int n = grid.length, m = grid[0].length;
		if (n == 0 || m == 0) return 0;

		this.visited2 = new boolean[n][m];
		int ans = 0;
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				if (!visited2[i][j] && grid[i][j] == 1) {
					ans = Math.max(ans, dfs2(grid, i, j));
				}
			}
		}
		return ans;
	}

	private int dfs2(int[][] grid, int i, int j) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || visited2[i][j]) {
			return 0;
		}
		visited2[i][j] = true;
		int ans = 1;
		ans += dfs2(grid, i + 1, j);
		ans += dfs2(grid, i - 1, j);
		ans += dfs2(grid, i, j + 1);
		ans += dfs2(grid, i, j - 1);
		return ans;
	}
}