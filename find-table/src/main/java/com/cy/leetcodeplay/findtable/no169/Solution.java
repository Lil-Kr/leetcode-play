package com.cy.leetcodeplay.findtable.no169;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @Author: Lil-K
 * @Date: 2024/9/29
 * @Description: 169. Majority Element
 */
public class Solution {

	/**
	 * 解法一: 题目要求使用O(1)的空间
	 * @param nums
	 * @return
	 */
	public int majorityElement(int[] nums) {
		int candidate = nums[0];
		int count = 1;

		// 1. 找到候选多数元素
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == candidate) {
				count++;
			} else {
				count--;
				if (count == 0) {
					candidate = nums[i];
					count = 1;
				}
			}
		}

		// 2. 返回候选元素
		return candidate;
	}

	/**
	 * 解法二: 使用Map
	 */
	public int majorityElement2(int[] nums) {
		Map<Integer, Integer> res = new HashMap<>();
		for (int num : nums) {
			res.put(num, res.getOrDefault(num, 0) + 1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
			(a, b) -> b.getValue() - a.getValue()
		);

		for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
			maxHeap.offer(entry);
		}

		return maxHeap.peek().getKey();
	}
}