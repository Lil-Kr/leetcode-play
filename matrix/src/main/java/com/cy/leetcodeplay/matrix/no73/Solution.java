package com.cy.leetcodeplay.matrix.no73;

/**
 * @Author: Lil-K
 * @Date: 2025/3/1
 * @Description: no.73. Set Matrix Zeroes
 * link: https://leetcode.com/problems/set-matrix-zeroes/description/
 */
public class Solution {


	/**
	 *
	 * @param matrix
	 */
	public void setZeroes(int[][] matrix) {
		if (matrix.length == 0 || matrix[0].length == 0) return;

		int rows = matrix.length;
		int cols = matrix[0].length;
		boolean row0 = false, col0 = false;

		/**
		 * 检查第一行和第一列
		 * 第一行和第一列的特殊性
		 */
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 0) {
					if (i == 0) row0 = true; // 标记第一行
					if (j == 0) col0 = true; // 标记第一列
					matrix[i][0] = 0; // 标记第 j 列
					matrix[0][j] = 0; // 标记第 i 行
				}
			}
		}

		// 根据标记设置零
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		// 设置第一行
		if (row0) {
			for (int j = 0; j < cols; j++) {
				matrix[0][j] = 0;
			}
		}

		// 设置第一列
		if (col0) {
			for (int i = 0; i < rows; i++) {
				matrix[i][0] = 0;
			}
		}
	}
}