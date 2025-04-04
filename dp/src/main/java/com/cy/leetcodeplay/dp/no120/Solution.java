package com.cy.leetcodeplay.dp.no120;

import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/11/3
 * @Description: no.120. Triangle
 *
 * todo: 待完成
 * todo: 未录入题库
 */
public class Solution {

	/**
	 * 解法一: 纯递归
	 * @param triangle
	 * @return
	 */
	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle == null || triangle.size() == 0 || triangle.get(0).size() == 0) return 0;

		return minimumTotal(triangle, 0, 0);
	}

	private int minimumTotal(List<List<Integer>> triangle, int row, int col) {
		if (row == triangle.size() - 1) return triangle.get(row).get(col);

		/**
		 * 1. 向下移动 1 (row + 1, col)
		 * 2. 向下移动 1 + 向右移动 1 (row + 1, col + 1)
		 */
		int l = minimumTotal(triangle, row + 1, col);
		int r = minimumTotal(triangle, row + 1, col + 1);

		return triangle.get(row).get(col) + Math.min(l, r);
	}

	/**
	 * 解法二: 递归 + 记忆化搜索
	 * @param triangle
	 * @return
	 */
	public int minimumTotal2(List<List<Integer>> triangle) {
		if (triangle == null || triangle.size() == 0 || triangle.get(0).size() == 0) return 0;


		int n = triangle.size();
		int[][] memo = new int[n][n];
		/**
		 * 初始化 memo
		 */
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				memo[i][j] = Integer.MAX_VALUE;


		return minimumTotal2(triangle, 0, 0, memo);
	}

	private int minimumTotal2(List<List<Integer>> triangle, int row, int col, int[][] memo) {
		if (row == triangle.size() - 1) return triangle.get(row).get(col);

		if (memo[row][col] != Integer.MAX_VALUE) return memo[row][col];

		/**
		 * 1. 向下移动 1 (row + 1, col)
		 * 2. 向下移动 1 + 向右移动 1 (row + 1, col + 1)
		 */
		int l = minimumTotal2(triangle, row + 1, col, memo);
		int r = minimumTotal2(triangle, row + 1, col + 1, memo);

		memo[row][col] = triangle.get(row).get(col) + Math.min(l, r);

		return memo[row][col];
	}


	/**
	 * 解法三: 动态规划
	 * @param triangle
	 * @return
	 */
	public int minimumTotal3(List<List<Integer>> triangle) {
		int n = triangle.size();
		int[] dp = new int[n];

		for (int i = 0; i < n; i++) {
			dp[i] = triangle.get(n - 1).get(i);
		}

		for (int i = n - 2; i >= 0; i--) { // Start from the second last row
			for (int j = 0; j <= i; j++) {
				dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
			}
		}
		return dp[0];
	}

}
