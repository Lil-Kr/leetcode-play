package com.cy.leetcodeplay.array.no121;

/**
 * @Author: Lil-K
 * @Date: 2024/8/30
 * @Description: no.121. Best Time to Buy and Sell Stock
 *
 * 1. 记录并更新每遍历的元素, 获取到最小值, 也就是最小买入点
 * 2. 将每次check的元素 减 最小值(最小买入点), 就可以得到最大利润
 */
public class Solution {

	/**
	 *
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE; // 初始化最低价格
		int maxProfit = 0; // 初始化最大利润

		for (int price : prices) {
			// 更新最低价格
			if (price < minPrice) {
				minPrice = price;
			}
			// 计算当前利润并更新最大利润
			int currentProfit = price - minPrice;
			maxProfit = Math.max(maxProfit, currentProfit);
		}
		return maxProfit; // 返回最大利润
	}

	/**
	 *
	 * @param prices
	 * @return
	 */
	public int maxProfit2(int[] prices) {
		int n = prices.length;

		int minPrices = Integer.MAX_VALUE;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			minPrices = Math.min(minPrices, prices[i]);
			ans = Math.max(ans, prices[i] - minPrices);
		}
		return ans;
	}
}
