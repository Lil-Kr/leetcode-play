package com.cy.leetcodeplay.array.no74;

/**
 * @Author: Lil-K
 * @Date: 2024/9/29
 * @Description: no.74. Search a 2D Matrix
 * link: https://leetcode.com/problems/search-a-2d-matrix/
 * 要求: O(log(m * n)) time complexity
 * 一维索引与二维索引的关系
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

		int n = matrix.length; // 列数
		int m = matrix[0].length; // 每行的长度
		int l = 0, r = m * n - 1;

		/**
		 * r <= r: 表示最后找到这一个元素
		 */
		while (l <= r) {
			// 防止溢出
			int mid = l + (r - l) / 2;

			/**
			 * 计算中间值, 通过每行的长度
			 * 行号: mid / n
			 * 列号: mid % n
			 */
			int midValue = matrix[mid / m][mid % m];

			if (midValue == target) {
				return true; // 找到目标值
			} else if (midValue < target) {
				l = mid + 1; // 在右侧继续查找
			} else {
				r = mid - 1; // 在左侧继续查找
			}
		}
		return false;
	}
}
