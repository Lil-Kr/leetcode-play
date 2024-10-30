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

	private boolean[] col, dia1, dia2;

	/**
	 *
	 * @param n
	 * @return
	 */
	public List<List<String>> solveNQueens(int n) {
		col = new boolean[n];
		dia1 = new boolean[2 * n - 1];
		dia2 = new boolean[2 * n - 1];

		List<Integer> row = new ArrayList<>();
		putQueen(n,0, row);

		return res;
	}

	/**
	 * 尝试在一个n皇后问题中, 摆放第 index 行的皇后位置
	 * @param n
	 * @param index 当前处理第几行, 用 index 表示
	 * @param row
	 */
	private void putQueen(int n, int index, List<Integer> row) {
		if (index == n) {
			res.add(generateBoard(n, row));
			return;
		}

		/**
		 * 尝试将第index行的皇后摆放在第 i 列
		 */
		for (int i = 0; i < n; i++) {
			if (!col[i] && !dia1[index + i] && !dia2[index - i + n - 1]) {
				row.add(i);

				col[i] = true;
				dia1[index+i] = true;
				dia2[index - i + n - 1] = true;
				putQueen(n, index + 1, row);

				/**
				 * 回溯
				 */
				col[i] = false;
				dia1[index+i] = false;
				dia2[index - i + n - 1] = false;
				row.remove(row.size() - 1);
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