package com.cy.leetcodeplay.dp1.no118;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2025/9/16
 * @Description: no.118. Pascal's Triangle
 * link: https://leetcode.com/problems/pascals-triangle/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	private List<List<Integer>> res = new ArrayList<>();

	/**
	 * solution1: dp
	 * @param numRows
	 * @return
	 */
	public List<List<Integer>> generate(int numRows) {
		int[][] dp = new int[numRows][numRows];
		dp[0][0] = 1;
		for (int j = 1; j < numRows; j ++) {
			dp[0][j] = 0;
		}

		for (int i = 1; i < numRows; i ++) {
			dp[i][0] = 1;
		}

		List<Integer> list = new ArrayList<>();
		list.add(dp[0][0]);
		res.add(new ArrayList<>(list));

		for (int i = 1; i < numRows; i ++) {
			list = new ArrayList<>();
			list.add(dp[0][0]);
			for (int j = 1; j < i + 1; j ++) {
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				list.add(dp[i][j]);
			}
			res.add(new ArrayList<>(list));
		}
		return res;
	}

	/**
	 * solution2: dp + space compression
	 * @param numRows
	 * @return
	 */
	public List<List<Integer>> generate2(int numRows) {
		int[] dp = new int[numRows];
		dp[0] = 1;

		for (int i = 0; i < numRows; i++) {
			List<Integer> curList = new ArrayList<>();
			// 从右往左更新，避免覆盖
			for (int j = i; j >= 1; j--) {
				dp[j] = dp[j] + dp[j - 1];
			}
			// 把前 i+1 个数加入当前行
			for (int j = 0; j <= i; j++) {
				curList.add(dp[j]);
			}
			res.add(curList);
		}
		return res;
	}
}