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

	private int rows;
	private int minVal = Integer.MAX_VALUE;

	/**
	 *
	 * @param triangle
	 * @return
	 */
	public int minimumTotal(List<List<Integer>> triangle) {
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

	private int minimumTotal(List<List<Integer>> triangle, int sum) {
		int n = triangle.size();
		int j = 0;
		for (int i = 0; i < n; i ++) {
			List<Integer> nums = triangle.get(i);
			if (i == 0) {
				sum += nums.get(i);
				j = i;
			}

			for (int start = j; start < j + 1; j++) {
				minVal = Math.min(minVal, nums.get(start));
			}


		}
		return 0;
	}


}
