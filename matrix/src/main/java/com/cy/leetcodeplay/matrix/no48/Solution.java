package com.cy.leetcodeplay.matrix.no48;

/**
 * @Author: Lil-K
 * @Date: 2025/2/27
 * @Description: no.48. Rotate Image
 * link: https://leetcode.com/problems/rotate-image/description/
 *
 * 将一个矩阵顺时针旋转 90 度, 要求空间复杂度为: O(1)
 *
 * 对于每一个 (i, j) 位置的元素, 每次处理4个对称点, 逐层遍历，完成旋转
 * matrix[i][j] → matrix[j][n-1-i] → matrix[n-1-i][n-1-j] → matrix[n-1-j][i] → matrix[i][j]
 *
 * 定义四个点:
 * matrix[i][j]（左上角）
 *
 * matrix[j][n - i - 1]（右上角）
 *
 * matrix[n - i - 1][n - j - 1]（右下角）
 *
 * matrix[n - j - 1][i]（左下角）
 */
public class Solution {

	/**
	 * 解法一: 四个点旋转
	 * 要点:
	 *  计算行: 需要用 j 来计算
	 *  计算列: 需要用 i 来计算
	 * @param matrix
	 */
	public void rotate(int[][] matrix) {
		if (matrix.length == 1) return;

		int n = matrix.length;
		// 遍历每一层 (只需要遍历 n/2 层)
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i - 1; j++) {
				// 旋转四个点
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - j - 1][i];
				matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
				matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
				matrix[j][n - i - 1] = temp;
			}
		}
	}

}
