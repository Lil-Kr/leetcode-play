package com.cy.leetcodeplay.heap.no215;

import java.util.PriorityQueue;

/**
 * @Author: Lil-K
 * @Date: 2024/4/11
 * @Description: 使用堆的特性解决
 */
public class Solution2 {

	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			minHeap.offer(nums[i]);
		}

		for (int i = k; i < nums.length; i++) {
			if (nums[i] > minHeap.peek()) {
				minHeap.poll();
				minHeap.offer(nums[i]);
			}
		}

		return minHeap.peek();
	}
}
