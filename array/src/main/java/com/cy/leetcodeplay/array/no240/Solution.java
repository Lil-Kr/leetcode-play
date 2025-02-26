package com.cy.leetcodeplay.array.no240;

/**
 * @Author: Lil-K
 * @Date: 2024/10/20
 * @Description: no.240. Search a 2D Matrix II
 *
 */
public class Solution {

	/**
	 *
	 * @param matrix
	 * @param target
	 * @return
	 */
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false; // 矩阵为空的情况
		}

		int rows = matrix.length;
		int cols = matrix[0].length;
		int row = 0, col = cols - 1;

		/**
		 * 如果当前元素等于目标值, 返回 true.
		 * 如果当前元素大于目标值, 向左移动列索引.
		 * 如果当前元素小于目标值, 向下移动行索引.
		 */
		while (row < rows && col >= 0) {

			int cur = matrix[row][col];
			if (cur > target) { // 向左移动
				col--;
			} else if (cur < target) { // 向下移动
				row++;
			} else {
				return true;
			}
		}

		return false;
	}
}
