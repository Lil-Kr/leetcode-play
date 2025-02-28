package com.cy.leetcodeplay.matrix.stackandqueue.stack.no150;

import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/18
 * @Description: no.150. Evaluate Reverse Polish Notation
 */
public class Solution {

	/**
	 * 利用单调栈可以比较容易解这题
	 * @return
	 */
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		for (String token : tokens) {
			if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
				int a = stack.pop();
				int b = stack.pop();
				switch (token) {
					case "+":
						stack.push(a + b);
						break;
					case "-":
						stack.push(b - a);
						break;
					case "*":
						stack.push(a * b);
						break;
					case "/":
						stack.push(b / a);
						break;
				}
			} else {
				stack.push(Integer.parseInt(token));
			}
		}
		return stack.pop();
	}

}
