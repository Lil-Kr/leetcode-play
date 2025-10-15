package com.cy.leetcodeplay.dp1.no983;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/11/2
 * @Description: no.983. Minimum Cost For Tickets
 * link: https://leetcode.com/problems/minimum-cost-for-tickets/description
 *
 * todo: 未录入Anki
 * 一维动态规划
 */
public class Solution {

	// ticket type
	private int[] tickets = {1, 7, 30};

	/**
	 * solution1: 暴力递归
	 * @param days
	 * @param costs
	 * @return
	 */
	public int mincostTickets(int[] days, int[] costs) {
		return f1(days, costs, 0);
	}

	/**
	 * @param days
	 * @param costs
	 * @param index next start index position for days[index]
	 * @return
	 */
	private int f1(int[] days, int[] costs, int index) {
		if (index == days.length) return 0;

		int ans = Integer.MAX_VALUE;

		/**
		 * k 是方案编号: 0 1 2
		 */
		for (int k = 0, i = index; k < tickets.length; k ++) {
			while (i < days.length && days[index] + tickets[k] > days[i]) {
				i ++;
			}
			ans = Math.min(ans, costs[k] + f1(days, costs, i));
		}
		return ans;
	}

	/**
	 * solution2: 递归 + 记忆化搜索
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
		for (int k = 0, i = index; k < tickets.length; k++) {
			while (i < days.length && days[index] + tickets[k] > days[i]) {
				i++;
			}
			ans = Math.min(ans, costs[k] + f2(days, costs, i, dp));
		}
		dp[index] = ans;
		return ans;
	}

	/**
	 * solution3: dp
	 * down -> top
	 * the performance is slowly than solution2.
	 * @param days
	 * @param costs
	 * @return
	 */
	public int mincostTickets3(int[] days, int[] costs) {
		int n = days.length;
		int[] dp = new int[n + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
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