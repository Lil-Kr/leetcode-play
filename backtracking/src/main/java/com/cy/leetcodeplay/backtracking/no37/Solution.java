package com.cy.leetcodeplay.backtracking.no37;

/**
 * @Author: Lil-K
 * @Date: 2024/11/1
 * @Description: no. 37. Sudoku Solver
 * todo: 未录入题库
 *
 */
public class Solution {

	/**
	 *
	 * @param board
	 */
	public void solveSudoku(char[][] board) {
		if (board == null || board.length == 0 || board[0].length == 0) return;

		backtrack(board);
	}

	private boolean backtrack(char[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.') {
					for (char c = '1'; c <= 9; c++) {
						if (isValid(board, i, j, c)) {
							board[i][j] = c;
							// 继续填下一格
							if (backtrack(board)) {
								return true;
							}
							// 回溯
							board[i][j] = '.';
						}
					}
					// 若 1-9 都不符合, 返回 false
					return false;
				}
			}
		}
		return true;
	}

	/**
	 *
	 * @param board
	 * @param row
	 * @param col
	 * @param c
	 * @return
	 */
	private boolean isValid(char[][] board, int row, int col, char c) {
		for (int i = 0; i < 9; i++) {
			// 行和列检查
			if (board[row][i] == c || board[i][col] == c) {
				return false;
			}
			// 子格检查
			int boxRow = 3 * (row / 3) + i / 3;
			int boxCol = 3 * (col / 3) + i % 3;
			if (board[boxRow][boxCol] == c) {
				return false;
			}
		}
		return true;
	}

}