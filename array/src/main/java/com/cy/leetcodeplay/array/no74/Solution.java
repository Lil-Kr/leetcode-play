package com.cy.leetcodeplay.array.no74;

/**
 * @Author: Lil-K
 * @Date: 2024/9/29
 * @Description: no.74. Search a 2D Matrix
 *
 * 要求: O(log(m * n)) time complexity
 *
 * 一维索引与二维索引的关系
 *
 */
public class Solution {

	/**
	 * 关键是计算索引
	 * @param matrix
	 * @param target
	 * @return
	 */
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false; // 矩阵为空的情况
		}

		int m = matrix.length; // 列数
		int n = matrix[0].length; // fix 每行的长度
		int left = 0, right = m * n - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2; // 防止溢出
			int midValue = matrix[mid / n][mid % n]; // 计算中间值

			if (midValue == target) {
				return true; // 找到目标值
			} else if (midValue < target) {
				left = mid + 1; // 在右侧继续查找
			} else {
				right = mid - 1; // 在左侧继续查找
			}
		}
		return false;
	}


}
