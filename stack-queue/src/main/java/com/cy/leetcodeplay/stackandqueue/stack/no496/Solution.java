package com.cy.leetcodeplay.stackandqueue.stack.no496;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2025/9/3
 * @Description: no.496. Next Greater Element I
 * link: https://leetcode.com/problems/next-greater-element-i/description/
 *
 * todo: 未录入题库
 * Monotonic Stack
 */
public class Solution {

	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		Deque<Integer> stack = new ArrayDeque<>();

		for (int num : nums2) {
			while (!stack.isEmpty() && num > stack.peek()) {
				map.put(stack.pop(), num);
			}
			stack.push(num);
		}

		int[] res = new int[nums1.length];
		for (int i = 0; i < nums1.length; i ++) {
			res[i] = map.getOrDefault(nums1[i], -1);
		}
		return res;
	}
}