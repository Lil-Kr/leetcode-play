package com.cy.leetcodeplay.matrix.dp.no264;

import java.util.PriorityQueue;

/**
 * @Author: Lil-K
 * @Date: 2024/11/8
 * @Description: no.264. Ugly Number II
 * link: https://leetcode.com/problems/ugly-number-ii/description/
 *
 * todo: 未录入题库
 */
public class Solution {

	/**
	 * 优先队列, 最小堆
	 * 性能差很多
	 * @param n
	 * @return
	 */
	public int nthUglyNumber(int n) {
		if (n == 1) return 1;

		PriorityQueue<Long> minHeap = new PriorityQueue<>();

		long res = 1;

		int i = 1;
		while (i < n) {
			// 计算第二个丑数
			long a = res * 2;
			long b = res * 3;
			long c = res * 5;

			minHeap.offer(a);
			minHeap.offer(b);
			minHeap.offer(c);

			res = minHeap.poll();
			while (res >= minHeap.peek()) {
				minHeap.poll();
			}
			i++;
		}

		return (int)res;
	}

	/**
	 * 过期问题
	 * @param n
	 * @return
	 */
	public int nthUglyNumber2(int n) {
		int[] dp = new int[n + 1];
		dp[1] = 1;

		/**
		 * i2, i3, i5 的下标
		 */
		int i2 = 1, i3 = 1, i5 = 1;
		int a, b, c, cur;

		for (int i = 2; i <= n; i++) {
			a = dp[i2] * 2; // * 2 的指针停留的下标
			b = dp[i3] * 3; // * 3 的指针停留的下标
			c = dp[i5] * 5; // * 5 的指针停留的下标
			cur = Math.min(Math.min(a, b), c);
			dp[i] = cur;

			/**
			 * 更新指针
			 */
			if (cur == a) i2 ++;
			if (cur == b) i3 ++;
			if (cur == c) i5 ++;
		}
		return dp[n];
	}
}