package com.cy.leetcodeplay.array.no121;

/**
 * @Author: Lil-K
 * @Date: 2024/8/30
 * @Description:
 *
 * 1. 记录并更新每遍历的元素, 获取到最小值, 也就是最小买入点
 * 2. 将每次check的元素 减 最小值(最小买入点), 就可以得到最大利润
 */
public class Solution {

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
}
