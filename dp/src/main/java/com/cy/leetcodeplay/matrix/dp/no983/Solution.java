package com.cy.leetcodeplay.matrix.dp.no983;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/11/2
 * @Description: no.983. Minimum Cost For Tickets
 * link: https://leetcode.com/problems/minimum-cost-for-tickets/description/
 * todo: 未录入题库
 *
 * 一维动态规划
 */
public class Solution {

	private int[] tickets = {1, 7, 30};

	/**
	 * 解法一: 暴力递归
	 * @param days
	 * @param costs
	 * @return
	 */
	public int mincostTickets(int[] days, int[] costs) {

		return f1(days, costs, 0);
	}

	/**
	 *
	 * @param days
	 * @param costs
	 * @param index 可变参数
	 * @return
	 */
	private int f1(int[] days, int[] costs, int index) {
		if (index == days.length) return 0;

		int ans = Integer.MAX_VALUE;

		/**
		 * k 是方案编号: 0 1 2
		 */
		for (int k = 0, j = index; k < tickets.length; k++) {
			while (j < days.length && days[index] + tickets[k] > days[j]) {
				j++;
			}
			ans = Math.min(ans, costs[k] + f1(days, costs, j));
		}
		return ans;
	}


	/**
	 * 解法二: 递归 + 记忆化搜索
	 * @param days
	 * @param costs
	 * @return
	 */
	public int mincostTickets2(int[] days, int[] costs) {
		int[] dp = new int[days.length];
		Arrays.fill(dp, -1);
		return f2(days, costs, 0, dp);
	}

	private int f2(int[] days, int[] costs, int index, int[] dp) {
		if (index == days.length) return 0;

		if (dp[index] != -1) return dp[index];

		int ans = Integer.MAX_VALUE;

		/**
		 * k 是方案编号: 0 1 2
		 */
		for (int k = 0, j = index; k < tickets.length; k++) {
			while (j < days.length && days[index] + tickets[k] > days[j]) {
				j++;
			}
			ans = Math.min(ans, costs[k] + f2(days, costs, j, dp));
		}
		dp[index] = ans;
		return ans;
	}


	/**
	 * 解法三: 动态规划
	 * @param days
	 * @param costs
	 * @return
	 */
	public int mincostTickets3(int[] days, int[] costs) {
		int[] dp = new int[366];
		int n = days.length;
		Arrays.fill(dp, 0, days.length + 1, Integer.MAX_VALUE);
		dp[n] = 0;

		for (int i = n - 1; i >= 0; i--) {
			for (int k = 0, j = i; k < tickets.length; k++) {
				while (j < n && days[i] + tickets[k] > days[j]) {
					j++;
				}
				dp[i] = Math.min(dp[i], costs[k] + dp[j]);
			}
		}
		return dp[0];
	}
}