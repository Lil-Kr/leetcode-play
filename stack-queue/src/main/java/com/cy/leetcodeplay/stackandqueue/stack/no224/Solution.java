package com.cy.leetcodeplay.stackandqueue.stack.no224;

import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/23
 * @Description: no.224. Basic Calculator
 */
public class Solution {

	/**
	 *
	 * @param s
	 * @return
	 */
	public int calculate(String s) {
		Stack<Integer> stack = new Stack<>();
		int res = 0;
		int number = 0;
		int sign = 1;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') continue;

			if (Character.isDigit(ch)) {
				number = number * 10 + (ch - '0');
			} else if (ch == '+' || ch == '-') {
				res += number * sign;
				number = 0; // re-set
				sign = ch == '+' ? 1 : -1;
			} else if (ch == '(') {
				stack.push(res);
				stack.push(sign);
				res = 0;
				sign = 1;
			} else if (ch == ')') {
				// 遇到右括号, 先把当前结果加上最后一个数字
				res += sign * number;
				number = 0;

				// 先出栈符号, 修改res符号
				res *= stack.pop();

				// 后出栈之前的结构, 做运算
				res += stack.pop();
			}
		}

		/**
		 * 处理最后一个数字
		 */
		if (number != 0) {
			res += sign * number;
		}
		return res;
	}
}