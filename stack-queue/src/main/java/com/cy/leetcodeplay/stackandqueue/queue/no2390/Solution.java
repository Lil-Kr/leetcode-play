package com.cy.leetcodeplay.stackandqueue.queue.no2390;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @Author: Lil-K
 * @Date: 2025/8/27
 * @Description: no.2390. Removing Stars From a String
 * link: https://leetcode.com/problems/removing-stars-from-a-string/description/
 * todo: 未录入题库
 */
public class Solution {

	/**
	 * solution 1
	 * this solution is better performance
	 * @param s
	 * @return
	 */
	public String removeStars(String s) {
		Deque<Character> stack = new ArrayDeque<>();

		for (int i = 0; i < s.length(); i ++) {
			char c = s.charAt(i);
			if (c == '*') {
				stack.pollLast();
			} else {
				stack.offerLast(c);
			}
		}

		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pollFirst());
		}
		return sb.toString();
	}

	/**
	 * solution 2
	 * @param s
	 * @return
	 */
	public String removeStars2(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i ++) {
			char c = s.charAt(i);
			if (c != '*') {
				stack.push(c);
				continue;
			}

			if (!stack.isEmpty()) {
				stack.pop();
			}
		}

		if (stack.isEmpty()) {
			return "";
		}

		return stack.stream().map(String::valueOf).collect(Collectors.joining());
	}

}