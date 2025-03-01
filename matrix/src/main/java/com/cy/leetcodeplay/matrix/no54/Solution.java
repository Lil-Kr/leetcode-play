package com.cy.leetcodeplay.matrix.no54;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2025/2/28
 * @Description: no.54. Spiral Matrix
 * link: https://leetcode.com/problems/spiral-matrix/description/
 */
public class Solution {


	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<>();
		if (matrix.length == 0) return res;

		int top = 0, bottom = matrix.length - 1;
		int left = 0, right = matrix[0].length - 1;

		while (top <= bottom && left <= right) {
			// 从左到右遍历 top 行
			for (int i = left; i <= right; i++) {
				res.add(matrix[top][i]);
			}
			top++;

			// 从上到下遍历 right 列
			for (int i = top; i <= bottom; i++) {
				res.add(matrix[i][right]);
			}
			right--;

			if (top <= bottom) {
				// 从右到左遍历 bottom 行
				for (int i = right; i >= left; i--) {
					res.add(matrix[bottom][i]);
				}
				bottom--;
			}

			if (left <= right) {
				// 从下到上遍历 left 列
				for (int i = bottom; i >= top; i--) {
					res.add(matrix[i][left]);
				}
				left++;
			}
		}
		return res;
	}
}
