package com.cy.leetcodeplay.matrix.stackandqueue.stack.no20;

import java.util.Stack;

/**
 * @Author: Lil-K
 * @Date: 2024/9/17
 * @Description: no.20. Valid Parentheses
 *
 * link: https://leetcode.com/problems/valid-parentheses/description/
 */
public class Solution {

	/**
	 *
	 * @param s
	 * @return
	 */
	public boolean isValid(String s) {
		if (s.length() % 2 != 0) return false;
		Stack<String> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			String ch = String.valueOf(s.charAt(i));

			if (!stack.isEmpty()) {
				if (ch.equals(")") && stack.peek().equals("(")) {
					stack.pop();
					continue;
				} else if (ch.equals("}") && stack.peek().equals("{")) {
					stack.pop();
					continue;
				} else if (ch.equals("]") && stack.peek().equals("[")) {
					stack.pop();
					continue;
				}
			}
			stack.push(ch);
		}

		return stack.isEmpty();
	}

	/**
	 * 解法二
	 * leetcode判题系统: 解法二性能更好
	 * @param s
	 * @return
	 */
	public boolean isValid2(String s) {
		if (s.length() % 2 != 0) return false;

		Stack<String> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			String ch = String.valueOf(s.charAt(i));
			if (ch.equals("(") || ch.equals("{") || ch.equals("[")) {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) return false;

				String peek = stack.peek();
				if ((ch.equals(")") && peek.equals("("))
					|| (ch.equals("}") && peek.equals("{"))
					|| (ch.equals("]") && peek.equals("["))) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
