package com.cy.leetcodeplay.backtracking.no79;

/**
 * @Author: Lil-K
 * @Date: 2024/10/28
 * @Description: no.79. Word Search
 * link: https://leetcode.com/problems/word-search/description/
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * 定义上下左右四个方向(顺时针方向)
	 * 上, 右, 下, 左
	 */
	private int[][] direction = {{-1,0},{0,1},{1,0},{0,-1}};
	private int rows, cols;
	private boolean[][] visited;

	/**
	 *
	 * @param board
	 * @param word
	 * @return
	 */
	public boolean exist(char[][] board, String word) {
		rows = board.length;
		assert (rows > 0);
		cols = board[0].length;

		// 初始化 visited
		visited = new boolean[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				/**
				 * 从 [i,j] 开始搜索
				 */
				if (searchWord(board, word, 0, i, j)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 *
	 * @param board
	 * @param word
	 * @param index
	 * @param startx
	 * @param starty
	 * @return
	 */
	private boolean searchWord(char[][] board, String word, int index, int startx, int starty) {
		if (index == word.length() - 1) {
			return board[startx][starty] == word.charAt(index);
		}

		if (board[startx][starty] == word.charAt(index)) {
			/**
			 * 标记使用过的字符
			 */
			visited[startx][starty] = true;

			/**
			 * 从 startx, starty 出发, 向四个方向寻找
			 * i < 4 表示 上, 右, 下, 左, 向这四个方向寻找
			 */
			for (int i = 0; i < 4; i++) {
				int newx = startx + direction[i][0];
				int newy = starty + direction[i][1];

				/**
				 * 判断是否越界 和 判断是否被使用过
				 */
				if (inArea(newx, newy) && !visited[newx][newy]) {
					boolean res1 = searchWord(board, word, index + 1, newx, newy);
					if (res1) {
						return true;
					}
				}
			}
			// 回溯
			visited[startx][starty] = false;
		}
		return false;
	}

	/**
	 * 判断新索引是否越界
	 * @param x
	 * @param y
	 * @return
	 */
	private boolean inArea(int x, int y) {
		return x >= 0 && x < rows && y >= 0 && y < cols;
	}
}