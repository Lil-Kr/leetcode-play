package com.cy.leetcodeplay.array.no123;

/**
 * @Author: Lil-K
 * @Date: 2024/8/31
 * @Description:
 */
public class Solution {

	public static void main(String[] args) {
		int[] arr = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
		int i = maxProfit(arr);
		System.out.println(i);
	}

	public static int maxProfit(int[] prices) {
		int firstBuy = Integer.MIN_VALUE, firstSell = 0;
		int secondBuy = Integer.MIN_VALUE, secondSell = 0;

		for (int price : prices) {
			// 第一次买入后的最大利润
			firstBuy = Math.max(firstBuy, -price);
			// 第一次卖出后的最大利润
			firstSell = Math.max(firstSell, firstBuy + price);
			// 第二次买入后的最大利润
			secondBuy = Math.max(secondBuy, firstSell - price);
			// 第二次卖出后的最大利润
			secondSell = Math.max(secondSell, secondBuy + price);
		}

		return secondSell;
	}
}
