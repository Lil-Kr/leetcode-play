package com.cy.leetcodeplay.graph.no785;

/**
 * @Author: Lil-K
 * @Date: 2025/11/2
 * @Description: no.785. Is Graph Bipartite?
 * link: https://leetcode.com/problems/is-graph-bipartite/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	private int[][] graph;

	private int[] colors;

	private boolean[] visited;

	/**
	 *
	 * @param graph
	 * @return
	 */
	public boolean isBipartite(int[][] graph) {
		this.graph = graph;

		int n = graph.length;

		this.colors = new int[n];
		this.visited = new boolean[n];

		for (int v = 0; v < n; v ++) {
			if (!visited[v]) {
				if (!dfs(v, 0)) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean dfs(int v, int color) {
		visited[v] = true;
		colors[v] = color;

		for (int w : graph[v]) {
			if (!visited[w]) {
				if (!dfs(w, 1 - color)) return false;
			} else if (colors[w] == colors[v]) {
				return false;
			}
		}
		return true;
	}
}