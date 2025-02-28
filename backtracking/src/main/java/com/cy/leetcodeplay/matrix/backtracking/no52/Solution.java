package com.cy.leetcodeplay.matrix.backtracking.no52;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/30
 * @Description: no.52. N-Queens II
 */
public class Solution {

	private int count = 0;
	private boolean[] cols, dia1, dia2;
	private List<Integer> col = new ArrayList<>();

	/**
	 *
	 * @param n
	 * @return
	 */
	public int totalNQueens(int n) {
		cols = new boolean[n];
		dia1 = new boolean[2 * n - 1];
		dia2 = new boolean[2 * n - 1];

		putQueen(n,0, col);

		return count;
	}

	private void putQueen(int n, int row, List<Integer> col) {
		if (row == n) {
			count++;
			return;
		}

		/**
		 * 尝试将第index行的皇后摆放在第 i 列
		 */
		for (int i = 0; i < n; i++) {
			if (!cols[i] && !dia1[row + i] && !dia2[row - i + n - 1]) {
				col.add(i);

				cols[i] = true;
				dia1[row + i] = true;
				dia2[row - i + n - 1] = true;
				putQueen(n, row + 1, col);

				/**
				 * 回溯
				 */
				cols[i] = false;
				dia1[row + i] = false;
				dia2[row - i + n - 1] = false;
				col.remove(col.size() - 1);
			}
		}
	}
}