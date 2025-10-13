package com.cy.leetcodeplay.dpoptimizeenumeration.no123;

/**
 * @Author: Lil-K
 * @Date: 2024/8/31
 * @Description: no.123. Best Time to Buy and Sell Stock III
 * link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/description/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: recursive
	 * @param prices
	 * @return
	 */
	public static int maxProfit(int[] prices) {
		int n = prices.length;

		/**
		 * dp1[i]: [0 ... i] 范围上只要发生一次交易即可, 不需要是最优收益, 机算所有的交易结果放入 dp1[i]
		 * dp1[0] = 0;
		 */
		int[] dp1 = new int[n];
		for (int i = 1, min = prices[0]; i < n; i ++) {
			// 选较小的金额买入
			min = Math.min(min, prices[i]);
			// 记录每个卖出的收益
			dp1[i] = Math.max(dp1[i - 1], prices[i] - min);
		}

		/**
		 * dp2[i]: [0 ... i] 范围上发生的第 2 次交易, 并且第二次交易在 [i] 时刻卖出的最大利润
		 * dp2[0]: 在[0]位置买入同时又卖出, dp2[0] = 0;
 		 */
		int[] dp2 = new int[n];
		int ans = 0;
		for (int i = 1; i < n; i ++) {
			// 第二次交易一定要在 [i] 时刻卖出
			for (int j = 0; j <= i; j ++) {
				// 枚举第二次交易的买入时刻, j <= i
				dp2[i] = Math.max(dp2[i], dp1[j] + (prices[i] - prices[j]));
			}
			ans = Math.max(ans, dp2[i]);
		}
		return ans;
	}

	/**
	 * solution2: use best[] for help
	 * 观察出优化枚举的方法, 引入 best 数组
	 * 需要分析能力
	 * @param prices
	 * @return
	 */
	public static int maxProfit2(int[] prices) {
		int n = prices.length;

		/**
		 * dp1[i]: [0 ... i] 范围上只要发生一次交易即可, 不需要是最优收益, 机算所有的交易结果放入 dp1[i]
		 * dp1[0] = 0;
		 */
		int[] dp1 = new int[n];
		for (int i = 1, min = prices[0]; i < n; i ++) {
			// 选较小的金额买入
			min = Math.min(min, prices[i]);
			// 记录每个卖出的收益
			dp1[i] = Math.max(dp1[i - 1], prices[i] - min);
		}

		/**
		 * best[i]: [0 ... 1] 范围上, 所有的 dp1[i] - prices[i], 最大值是多少
		 * 这是数组的设置完全是为了替代最后 for 循环的枚举
		 */
		int[] best = new int[n];
		best[0] = dp1[0] - prices[0];
		for (int i = 1; i < n; i ++) {
			best[i] = Math.max(best[i - 1], dp1[i] - prices[i]);
		}

		/**
		 * dp2[i]: [0 ... i] 范围上发生的第 2 次交易, 并且第二次交易在 [i] 时刻卖出的最大利润
		 * dp2[0]: 在[0]位置买入同时又卖出, dp2[0] = 0;
		 */
		int[] dp2 = new int[n];
		int ans = 0;
		for (int i = 1; i < n; i ++) {
//			// 第二次交易一定要在 [i] 时刻卖出
//			for (int j = 0; j <= i; j ++) {
//				// 枚举第二次交易的买入时刻, j <= i
//				dp2[i] = Math.max(dp2[i], dp1[j] + (prices[i] - prices[j]));
//			}
			/**
			 * best[i] 替代了 dp1[j] 的行为
			 */
			dp2[i] = best[i] + prices[i];
			ans = Math.max(ans, dp2[i]);
		}
		return ans;
	}


	/**
	 * solution3:
	 * 等译改写, 因为for loop的条件都是一样的
	 * @param prices
	 * @return
	 */
	public static int maxProfit3(int[] prices) {
		int n = prices.length;

		/**
		 * dp1[i]: [0 ... i] 范围上只要发生一次交易即可, 不需要是最优收益, 机算所有的交易结果放入 dp1[i]
		 * dp1[0] = 0;
		 */
		int[] dp1 = new int[n];

		/**
		 * best[i]: [0 ... 1] 范围上, 所有的 dp1[i] - prices[i], 最大值是多少
		 * 这是数组的设置完全是为了替代最后 for 循环的枚举
		 */
		int[] best = new int[n];
//		best[0] = dp1[0] - prices[0];
		best[0] = prices[0];

		/**
		 * dp2[i]: [0 ... i] 范围上发生的第 2 次交易, 并且第二次交易在 [i] 时刻卖出的最大利润
		 * dp2[0]: 在[0]位置买入同时又卖出, dp2[0] = 0;
		 */
		int[] dp2 = new int[n];
		int ans = 0;
		for (int i = 1, min = prices[0]; i < n; i ++) {
			// 选较小的金额买入
			min = Math.min(min, prices[i]);
			// 记录每个卖出的收益
			dp1[i] = Math.max(dp1[i - 1], prices[i] - min);

			/**
			 * best[i]
			 */
			best[i] = Math.max(best[i - 1], dp1[i] - prices[i]);

			/**
			 * best[i] 替代了 dp1[j] 的行为
			 */
			dp2[i] = best[i] + prices[i];
			ans = Math.max(ans, dp2[i]);
		}
		return ans;
	}

	/**
	 * solution4:
	 * 继续观察和优化优化, 等译改写
	 * 改为空间压缩, 使用一个变量滚动更新得到解
	 * @param prices
	 * @return
	 */
	public static int maxProfit4(int[] prices) {
		int n = prices.length;
		int dp1 = 0;
		int best = -prices[0];
		int ans = 0;
		for (int i = 1, min = prices[0]; i < n; i ++) {
			min = Math.min(min, prices[i]);
			dp1 = Math.max(dp1, prices[i] - min);
			best = Math.max(best, dp1 - prices[i]);
			ans = Math.max(ans, best + prices[i]);
		}
		return ans;
	}
}
