package com.cy.leetcodeplay.graph.no1091;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Lil-K
 * @Date: 2025/11/4
 * @Description: no.1091. Shortest Path in Binary Matrix
 * link: https://leetcode.com/problems/shortest-path-in-binary-matrix/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	private int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
	private int R, C;
	/**
	 * solution1: not build Graph
	 * @param grid
	 * @return
	 */
	public int shortestPathBinaryMatrix(int[][] grid) {
		R = grid.length; C = grid[0].length;
		boolean[][] visited = new boolean[R][C];
		int[][] distance = new int[R][C];

		if (grid[0][0] == 1) return -1;
		if (R == 1 && C == 1) return 1;

		// BFS
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		visited[0][0] = true;
		distance[0][0] = 1;
		while (!queue.isEmpty()) {
			int cur = queue.poll();
			// 一维索引转为 二维坐标
			int curX = cur / C, curY = cur % C;
			for (int[] direction : directions) {
				int nextX = curX + direction[0], nextY = curY + direction[1];
				if (inArea(nextX, nextY) && !visited[nextX][nextY] && grid[nextX][nextY] == 0) {
					int next = nextX * C + nextY;
					queue.offer(next);
					visited[nextX][nextY] = true;
					distance[nextX][nextY] = distance[curX][curY] + 1;
					if (nextX == R - 1 && nextY == C - 1) {
						return distance[nextX][nextY];
					}
				}
			}
		}
		return -1;
	}

	private boolean inArea(int nextX, int nextY) {
		return nextX >= 0 && nextX < R && nextY >= 0 && nextY < C;
	}
}