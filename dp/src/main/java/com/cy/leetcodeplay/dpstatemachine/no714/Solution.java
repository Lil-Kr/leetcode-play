package com.cy.leetcodeplay.dpstatemachine.no714;

/**
 * @Author: Lil-K
 * @Date: 2025/10/12
 * @Description: no.714. Best Time to Buy and Sell Stock with Transaction Fee
 * link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 *
	 * @param prices
	 * @param fee
	 * @return
	 */
	public int maxProfit(int[] prices, int fee) {
		// 交易次数无限制的情况下, 获得收益的同时扣掉一次购买和手续费之后, 最好的情况
		int prepare = -prices[0] - fee;
		// 交易次数无限制情况下, 能获得的最大收益
		int done = 0;

		for (int i = 1; i < prices.length; i ++) {
			//
			done = Math.max(done, prepare + prices[i]);
			prepare = Math.max(prepare, done - prices[i] - fee);
		}
		return done;
	}
}