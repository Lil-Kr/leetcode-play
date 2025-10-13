package com.cy.leetcodeplay.dpoptimizeenumeration.no122;

/**
 * @Author: Lil-K
 * @Date: 2025/10/11
 * @Description: no.122. Best Time to Buy and Sell Stock II
 * link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * @return
	 */
	public int maxProfit(int[] prices) {
		int n = prices.length;
		int ans = 0;
		for (int i = 1; i < n; i ++) {
			ans += Math.max(0, prices[i] - prices[i - 1]);
		}
		return ans;
	}
}