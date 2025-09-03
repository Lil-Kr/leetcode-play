package com.cy.leetcodeplay.stackandqueue.stack.no901;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: Lil-K
 * @Date: 2025/9/3
 * @Description: no.901. Online Stock Span
 * link: https://leetcode.com/problems/online-stock-span/description/
 * todo: 未录入题库
 * Monotonic Stack
 */
public class StockSpanner {

	private Deque<int[]> stack;

	public StockSpanner() {
		stack = new ArrayDeque<>();
	}

	public int next(int price) {
		int span = 1;
		while (!stack.isEmpty() && stack.peek()[0] <= price) {
			span += stack.pop()[1];
		}
		stack.push(new int[]{price, span});
		return span;
	}
}