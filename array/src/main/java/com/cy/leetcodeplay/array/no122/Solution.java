package com.cy.leetcodeplay.array.no122;

/**
 * @Author: Lil-K
 * @Date: 2024/8/30
 * @Description:
 * 只有 prices[i] > prices[i-1], 就可以进行交易
 */
public class Solution {

	public int maxProfit(int[] prices) {
		if (prices.length <= 1) return 0;

		int sum = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				sum += prices[i] - prices[i - 1];
			}
		}
		return sum;
	}
}
