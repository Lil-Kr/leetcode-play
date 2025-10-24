package com.cy.leetcodeplay.greedy.no1029;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/10/23
 * @Description: no.1029. Two City Scheduling
 * link: https://leetcode.com/problems/two-city-scheduling/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: greedy
	 * @param costs
	 * @return
	 */
	public int twoCitySchedCost(int[][] costs) {
		int n = costs.length;
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i ++) {
			// 收集 a b 两个地点的差值
			arr[i] = costs[i][1] - costs[i][0];
			// 让所有人去 a 地点
			sum += costs[i][0];
		}
		// 求最小花费, 必须从最小的值机算
		Arrays.sort(arr);
		int m = n / 2;
		for (int i = 0; i < m; i ++) {
			sum += arr[i];
		}
		return sum;
	}
}