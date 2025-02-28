package com.cy.leetcodeplay.matrix.stackandqueue.stack.no739;

import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/22
 * @Description: no.739. Daily Temperatures
 */
public class Solution {

	/**
	 *
	 * @param temperatures
	 * @return
	 */
	public int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int[] result = new int[n];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			/**
			 * 如果当前温度高于栈顶存储的天数的温度, 则弹出栈顶元素并计算等待天数
			 */
			while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int prevDay = stack.pop();
				result[prevDay] = i - prevDay;
			}
			// 将当前天数入栈
			stack.push(i);
		}
		return result;
	}
}