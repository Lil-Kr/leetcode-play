package com.cy.leetcodeplay.stackandqueue.queue.no347;

import java.util.*;

/**
 * @Author: Lil-K
 * @Date: 2024/9/25
 * @Description: no.347. Top K Frequent Elements
 * link: https://leetcode.com/problems/top-k-frequent-elements/
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @param k
	 * @return
	 */
	public int[] topKFrequent(int[] nums, int k) {
		if (nums.length < 2) return nums;
		Map<Integer, Integer> freq = new HashMap<>();

		for (int num : nums) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}

		/**
		 * 创建最小堆, 根据Map的 value 从小到大入队
		 */
		PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
			(a, b) -> Integer.compare(a.getValue(), b.getValue())
		);

		/**
		 * 数量超过k, 要把最小的值挤出去
		 */
		for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
			minHeap.offer(entry);
			// 如果堆的大小超过 k, 移除最小的元素
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}

		List<Integer> result = new ArrayList<>();
		while (!minHeap.isEmpty()) {
			result.add(minHeap.poll().getKey());
		}

		// 由于是最小堆, 结果需要反转
		Collections.reverse(result);
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}