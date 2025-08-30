package com.cy.leetcodeplay.stackandqueue.queue.no2336;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @Author: Lil-K
 * @Date: 2025/8/29
 * @Description: no.2336. Smallest Number in Infinite Set
 * link: https://leetcode.com/problems/smallest-number-in-infinite-set/description/
 */
public class SmallestInfiniteSet {

	private int current;
	private PriorityQueue<Integer> minHeap;
	private Set<Integer> set;

	public SmallestInfiniteSet() {
		current = 1;
		minHeap = new PriorityQueue<>();
		set = new HashSet<>();
	}

	public int popSmallest() {
		if (! minHeap.isEmpty()) {
			int smallest = minHeap.poll();
			set.remove(smallest);
			return smallest;
		}
		return current ++;
	}

	public void addBack(int num) {
		if (num < current && !set.contains(num)) {
			minHeap.offer(num);
			set.add(num);
		}
	}
}
