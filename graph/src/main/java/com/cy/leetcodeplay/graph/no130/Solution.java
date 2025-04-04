package com.cy.leetcodeplay.graph.no130;

/**
 * @Author: Lil-K
 * @Date: 2024/11/1
 * @Description: no.130. Surrounded Regions
 * todo: 未录入题库
 * 
 * 题目: 
 *  给定一个二维的 board, 包含字符 'X' 和 'O', 找出所有被 'X' 包围的 'O' 区域, 并将它们翻转成 'X'.
 *  一个 'O' 区域被包围是指该区域内的所有 'O' 完全被 'X' 包围(即在上下左右四个方向上没有和边界相连的 'O')
 * 注意:
 *  边界上的 'O' 不能被 'X'完全包围, 需要特殊处理
 */
public class Solution {

	private int[][] direction = {{-1,0},{0,1},{1,0},{0,-1}};
	private int rows, cols;

	/**
	 * 需要先处理边界情况
	 *
	 * @param board
	 */
	public void solve(char[][] board) {
		if (board == null || board.length == 0 || board[0].length == 0) return;
		rows = board.length;
		cols = board[0].length;

		/**
		 * 1. 从边界开始DFS, 找到所有边界上的 'O' 及其相连的 'O'
		 */
		for (int i = 0; i < rows; i++) {
			// 左边界
			if (board[i][0] == 'O') dfs(board, i, 0);
			// 右边界
			if (board[i][cols - 1] == 'O') dfs(board, i, cols - 1);
		}

		for (int j = 0; j < cols; j++) {
			// 上边界
			if (board[0][j] == 'O') dfs(board, 0, j);
			// 下边界
			if (board[rows - 1][j] == 'O') dfs(board, rows - 1, j);
		}

		/**
		 * 2. 遍历所有节点, 将 'O' 变为 'X'(被围绕的区域), 将 '#' 恢复为 'O'(未被围绕的区域)
		 */
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (board[i][j] == 'O') {
					board[i][j] = 'X';
				} else if (board[i][j] == '#') {
					board[i][j] = 'O';
				}
			}
		}
	}

	/**
	 *
	 * @param board
	 * @param x
	 * @param y
	 */
	private void dfs(char[][] board, int x, int y) {
		board[x][y] = '#';

		for (int i = 0; i < 4; i++) {
			int newx = x + direction[i][0];
			int newy = y + direction[i][1];

			if (inArea(newx, newy) && board[newx][newy] == 'O') {
				dfs(board, newx, newy);
			}
		}
	}

	private boolean inArea(int x, int y) {
		return x >= 0 && x < rows && y >= 0 && y < cols;
	}
}