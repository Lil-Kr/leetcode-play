package com.cy.leetcodeplay.heap.no373;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Author: Lil-K
 * @Date: 2025/4/12
 * @Description: no.373. Find K Pairs with Smallest Sums
 * link: https://leetcode.com/problems/find-k-pairs-with-smallest-sums/description
 */
public class Solution {

	/**
	 *
	 * @param nums1
	 * @param nums2
	 * @param k
	 * @return
	 */
	public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		List<List<Integer>> res = new ArrayList<>();
		if (nums1.length == 0 || nums2.length == 0 || k == 0) return res;

		// 创建最小堆
		PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) ->
			Integer.compare(nums1[a[0]] + nums2[a[1]], nums1[b[0]] + nums2[b[1]])
		);

		/**
		 * 初始化堆, 固定 nums1 的前几个元素和 nums2[0] 搭配
		 * 减少
		 */
		int min = Math.min(nums1.length, k);
		for (int i = 0; i < min; i++) {
			// 存的是索引 pair: (i, j)
			minHeap.offer(new int[] {i, 0});
		}

		while (k > 0 && !minHeap.isEmpty()) {
			int[] pair = minHeap.poll();
			int i = pair[0], j = pair[1];
			res.add(Arrays.asList(nums1[i], nums2[j]));

			// 移动 nums2 的索引(i 固定, j + 1)
			if (j + 1 < nums2.length) {
				minHeap.offer(new int[] {i, j + 1});
			}
			k--;
		}
		return res;
	}
}