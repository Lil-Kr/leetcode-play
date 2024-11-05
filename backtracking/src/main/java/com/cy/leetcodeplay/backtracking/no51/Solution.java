package com.cy.leetcodeplay.backtracking.no51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/30
 * @Description: no.51. N-Queens
 * 每行, 每列, 两个对角线 都只能有1个皇后
 */
public class Solution {

	private List<List<String>> res = new ArrayList<>();

	/**
	 * cols: 竖向 占用情况
	 * dia1: 对角线1 撇
	 * dia2: 对角线2 捺
	 */
	private boolean[] cols, dia1, dia2;

	/**
	 *
	 * @param n 皇后数
	 * @return
	 */
	public List<List<String>> solveNQueens(int n) {
		/**
		 * 皇后数
		 */
		cols = new boolean[n];

		/**
		 * 2 * n - 1 : 对角线的条数
		 */
		dia1 = new boolean[2 * n - 1];
		dia2 = new boolean[2 * n - 1];

		List<Integer> row = new ArrayList<>();
		putQueen(n,0, row);

		return res;
	}

	/**
	 * 尝试在一个n皇后问题中, 摆放第 index 行的皇后位置
	 * @param n
	 * @param row 当前处理第几行, 用 row 表示 行数, 从0开始
	 * @param col
	 */
	private void putQueen(int n, int row, List<Integer> col) {
		if (row == n) {
			res.add(generateBoard(n, col));
			return;
		}

		/**
		 * 尝试将第 row 行的皇后摆放在第 i 列
		 */
		for (int i = 0; i < n; i++) {
			/**
			 * 判断第row行第i列的位置, 是否符合摆放皇后的位置
			 */
			if (!cols[i] && !dia1[row + i] && !dia2[row - i + n - 1]) {
				col.add(i);

				cols[i] = true; // 所在列
				dia1[row + i] = true; // 对角线1
				dia2[row - i + n - 1] = true; // 对角线2

				/**
				 * 递归
				 */
				putQueen(n, row + 1, col);

				/**
				 * 回溯
				 */
				cols[i] = false;
				dia1[row+i] = false;
				dia2[row - i + n - 1] = false;

				col.remove(col.size() - 1);
			}
		}
	}

	/**
	 * 生成题目所需要的结果拼装
	 * @param n
	 * @param row
	 * @return
	 */
	private List<String> generateBoard(int n, List<Integer> row) {
		assert (row.size() == n);
		List<String> board = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			char[] charArray = new char[n];
			Arrays.fill(charArray, '.');
			charArray[row.get(i)] = 'Q';
			board.add(new String(charArray));
		}
		return board;
	}
}