package com.cy.leetcodeplay.heap.no1046;

import java.util.PriorityQueue;

/**
 * @Author: Lil-K
 * @Date: 2025/10/28
 * @Description: no.1046. Last Stone Weight
 * link: https://leetcode.com/problems/last-stone-weight/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1: max heap
	 * @param stones
	 * @return
	 */
	public int lastStoneWeight(int[] stones) {
		int n = stones.length;
		if (n == 1) return stones[0];
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
		for (int stone : stones) {
			maxHeap.offer(stone);
		}
		while (maxHeap.size() > 1) {
			int x = maxHeap.poll();
			int y = maxHeap.poll();
			maxHeap.offer(Math.abs(x - y));
		}
		return maxHeap.poll();
	}
}