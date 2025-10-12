package com.cy.leetcodeplay.dpstatemachine.no309;

/**
 * @Author: Lil-K
 * @Date: 2025/10/12
 * @Description: no.309. Best Time to Buy and Sell Stock with Cooldown
 * link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 *
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {
		int n = prices.length;
		if (n < 2) return 0;

		int[] prepare = new int[n];
		int[] done = new int[n];
		prepare[1] = Math.max(-prices[0], -prices[1]);
		done[1] = Math.max(0, prices[1] - prices[0]);

		for (int i = 2; i < n; i ++) {
			done[i] = Math.max(done[i - 1], prepare[i - 1] + prices[i]);
			prepare[i] = Math.max(prepare[i - 1], done[i - 2] - prices[i]);
		}
		return done[n - 1];
	}

	/**
	 *
	 * @param prices
	 * @return
	 */
	public int maxProfit2(int[] prices) {
		int n = prices.length;
		if (n < 2) return 0;

		int prepare = Math.max(-prices[0], -prices[1]);
		int done1 = Math.max(0, prices[1] - prices[0]);
		int done2 = 0;

		for (int i = 2, cur; i < n; i ++) {
			cur = Math.max(done1, prepare + prices[i]);
			prepare = Math.max(prepare, done2 - prices[i]);
			done2 = done1;
			done1 = cur;
		}
		return done1;
	}
}