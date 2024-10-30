package com.cy.leetcodeplay.backtracking.no52;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/30
 * @Description: no.52. N-Queens II
 */
public class Solution {

	private int count = 0;
	private boolean[] col, dia1, dia2;
	/**
	 *
	 * @param n
	 * @return
	 */
	public int totalNQueens(int n) {
		col = new boolean[n];
		dia1 = new boolean[2 * n - 1];
		dia2 = new boolean[2 * n - 1];

		List<Integer> row = new ArrayList<>();
		putQueen(n,0, row);

		return count;
	}

	private void putQueen(int n, int index, List<Integer> row) {
		if (index == n) {
			count++;
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
}