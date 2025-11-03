package com.cy.leetcodeplay.graph.no733;

/**
 * @Author: Lil-K
 * @Date: 2025/11/3
 * @Description: no.733. Flood Fill
 * link: https://leetcode.com/problems/flood-fill/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1:
	 * @param image
	 * @param sr
	 * @param sc
	 * @param color
	 * @return
	 */
	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		int n = image.length, m = image[0].length;
		int sign = image[sr][sc];
		boolean[][] visited = new boolean[n][m];
		dfs(image, n, m, sign, color, visited, sr, sc);
		return image;
	}

	private void dfs(int[][] image, int n, int m, int sign, int color, boolean[][] visited, int i, int j) {
		if (i < 0 || i >= n || j < 0 || j >= m || visited[i][j] || image[i][j] != sign) {
			return;
		}
		visited[i][j] = true;
		image[i][j] = color;
		dfs(image, n, m, sign, color, visited, i - 1, j);
		dfs(image, n, m, sign, color, visited, i + 1, j);
		dfs(image, n, m, sign, color, visited, i, j - 1);
		dfs(image, n, m, sign, color, visited, i, j + 1);
	}
}