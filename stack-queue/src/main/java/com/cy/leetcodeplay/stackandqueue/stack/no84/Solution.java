package com.cy.leetcodeplay.stackandqueue.stack.no84;

import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/23
 * @Description: no.84. Largest Rectangle in Histogram
 * link: https://leetcode.com/problems/largest-rectangle-in-histogram/description/
 */
public class Solution {

	/**
	 *
	 * @param heights
	 * @return
	 */
	public int largestRectangleArea(int[] heights) {
		if (heights.length == 1) return heights[0];
		int n = heights.length;

		/**
		 * 单调栈: 栈中的元素是递增的
		 */
		Stack<Integer> stack = new Stack<>();
		int maxArea = 0;

		for (int i = 0; i < n; i++) {
			// 如果当前柱子高度小于栈顶柱子的高度, 计算以栈顶索引位置元素的高度的矩形面积
			while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
				// 栈顶索引对应的高度
				int height = heights[stack.pop()];
				// 计算宽度, 这里需要注意:
				int width = stack.isEmpty() ? i : i - stack.peek() - 1;
				// 更新最大面积
				maxArea = Math.max(maxArea, height * width);
			}
			stack.push(i); // 将当前柱子索引压入栈中
		}

		// 处理剩余的柱子 (栈不为空时)
		while (!stack.isEmpty()) {
			int height = heights[stack.pop()];
			int width = stack.isEmpty() ? n : n - stack.peek() - 1;
			maxArea = Math.max(maxArea, height * width);
		}
		return maxArea;
	}

}